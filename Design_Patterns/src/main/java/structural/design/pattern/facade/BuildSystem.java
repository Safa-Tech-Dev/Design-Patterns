package structural.design.pattern.facade;

public class BuildSystem {

    public boolean compileProject(){

        IO.println("BuildSystem: Compiling Project...");
        simulateDelay(2000);
        IO.println("BuildSystem: Build Successful...");
        return true;
    }
    public String getArtifactPath(){

        String path = "target/myapplication-1.0.jar";
        IO.println("BuildSystem: Artifact located at " + path);
        return path;
    }
    private void simulateDelay(int ms) {

        try{
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
