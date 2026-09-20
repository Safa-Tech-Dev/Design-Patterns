package structural.design.pattern.facade;

public class VersionControlSystem {

    public void pullLatestChanges(String branch){

        IO.println("VCS: Pulling latest changes from ' " + branch + " ' ...");
        simulateDelay();
        IO.println("VCS: Pull complete.");
    }

    private void simulateDelay() {

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
