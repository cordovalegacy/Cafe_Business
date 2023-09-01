import static java.lang.System.out;
import java.util.ArrayList;

public class App {

public static void main(String[] args) {

    out.println("<----Running App---->");

    //Instances
    Cafe streakGoal = new Cafe();
    Cafe orderTotal = new Cafe();
    Cafe menuList = new Cafe();
    Cafe greetCustomer = new Cafe();
    Cafe markupSheet = new Cafe();
    Cafe display = new Cafe();

    //Method Calls
    //#1
    out.println(streakGoal.getStreakGoal());
    out.println(streakGoal.getStreakGoal(5));
    //#2
    double[] numbers = {1.3, 2.5, 9.1, 5.4, 3.5, 6.2};
    out.println(orderTotal.getTotalAmount(numbers));
    //#3
    ArrayList<String> menuItems = new ArrayList<String>();
    menuItems.add("Mocha");
    menuItems.add("Latte");
    menuItems.add("Shake");
    menuItems.add("Drip");
    menuList.printMenu(menuItems);
    //#4
    ArrayList<String> customerNames = new ArrayList<String>();
    customerNames.add("Tori");
    customerNames.add("Brendan");
    customerNames.add("Jacob");
    customerNames.add("Matthew");
    greetCustomer.addCustomer(customerNames);
    //#5
    markupSheet.printPriceChart("Columbian Coffee Grounds", 15.00, 3);
    //#6
    ArrayList<String> products = new ArrayList<String>();
    products.add("Drip Coffee");
    products.add("Coffee");
    products.add("Drip");
    products.add("Dripee");
    ArrayList<Double> prices = new ArrayList<Double>();
    prices.add(1.5);
    prices.add(2.5);
    prices.add(3.5);
    prices.add(4.5);
    display.displayMenu(products, prices);
};
};