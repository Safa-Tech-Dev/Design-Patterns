package structural.design.pattern.facade;

public class DeploymentAppFacade {

    static void main() {

        DeploymentFacade deploymentFacade = new DeploymentFacade();

        // deploy a feature branch to staging
        deploymentFacade.deployApplication("feature/new-ui", "stage.server.example.com");


        // Deploy to Production
        deploymentFacade.deployApplication("main", "prod.server.example.com");


    }
}
