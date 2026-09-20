package structural.design.pattern.facade;

public class DeploymentFacade {

    private VersionControlSystem vcs = new VersionControlSystem();
    private BuildSystem buildSystem = new BuildSystem();
    private  TestingFramework testingFramework = new TestingFramework();
    private DeploymentTarget deploymentTarget = new DeploymentTarget();

    public boolean deployApplication(String branch, String serverAddress){

        IO.println("\n FACADE: --- Initiating FULL DEPLOYMENT for branch " + branch + " to " + serverAddress + " --- ");
        boolean isSuccess = true;

        try{

            vcs.pullLatestChanges(branch);

            if(!buildSystem.compileProject()){
                IO.println("FACADE: DEPLOYMENT FAILED - Build Compilation failed. ");
                return false;
            }

            String artifactPath = buildSystem.getArtifactPath();

            if(!testingFramework.runUnitTests()){
                IO.println("FACADE: DEPLOYMENT FAILED - Unit tests failed. ");
                return false;
            }
            if(!testingFramework.runIntegrationTests()){
                IO.println("FACADE: DEPLOYMENT FAILED - Integration tests failed. ");
                return false;
            }

            deploymentTarget.transferArtifact(artifactPath, serverAddress);
            deploymentTarget.activateNewVersion(serverAddress);

            IO.println("FACADE: APPLICATION DEPLOYED SUCCESSFULLY to " + serverAddress + "!");
        } catch (Exception e) {
            IO.println("FACADE: DEPLOYMENT FAILED - An unexpected error occurred " + e.getMessage());
            isSuccess = false;
        }
        return isSuccess;
    }
}
