package solid.principle.isp;

public class Client {

    public static void main(String[] args) {

        // Waiter
        WaiterInterface waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveCustomer();

        // Chef
        ChefInterface chef = new Chef();
        chef.decideMenu();
        chef.cookFood();
    }
}
