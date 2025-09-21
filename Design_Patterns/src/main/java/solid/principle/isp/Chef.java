package solid.principle.isp;

public class Chef implements ChefInterface{

    @Override
    public void cookFood() {

        System.out.println("Cooking delicious food...");
    }

    @Override
    public void decideMenu() {

        System.out.println("Deciding today's menu...");
    }
}
