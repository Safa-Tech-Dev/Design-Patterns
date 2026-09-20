package structural.design.pattern.facade;

public class DeploymentTarget {

    public void transferArtifact(String artifactPath, String server){

        IO.println("Deployment: Transferring " + artifactPath + " to " + server + " ...");
        simulateDelay(1000);
        IO.println("Deployment: Transfer Complete.");

    }
    public void activateNewVersion(String server){

        IO.println("Deployment: Activating new version on " + server + " ...");
        simulateDelay(500);
        IO.println("Deployment: Now Live " + server + "!");

    }

    private void simulateDelay(int ms) {

        try{
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
