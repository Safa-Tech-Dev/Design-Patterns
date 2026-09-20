package structural.design.pattern.facade;

public class TestingFramework {

    public boolean runUnitTests(){

        IO.println("Testing: Running unit Tests...");
        simulateDelay(1500);
        IO.println("Testing: Unit Tests passed...");
        return true;
    }
    public boolean runIntegrationTests(){

        IO.println("Testing: Running Integration Tests...");
        simulateDelay(3000);
        IO.println("Testing: Integration Tests passed...");
        return true;
    }
    private void simulateDelay(int ms) {

        try{
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
