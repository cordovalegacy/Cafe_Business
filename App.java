import static java.lang.System.out;
import java.util.ArrayList;

public class App {

public static void main(String[] args) {

    out.println("<----Running App---->");

    //Instances
    Cafe streakGoal = new Cafe();
    Cafe orderTotal = new Cafe();
    Cafe menuList = new Cafe();

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
};
};