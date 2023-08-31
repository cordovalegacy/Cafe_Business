import java.util.ArrayList;

public class Cafe{

    //signature 1
    public int getStreakGoal(){
        int sum = 0;
        int i = 0;
        while(i < 10){
            i++;
            sum += i;
        };
        System.out.println(sum);
        return sum;
    };

    //signature 2
    public int getStreakGoal(int numOfWeeks){
        int sum = 0;
        int i = 0;
        while(i < numOfWeeks){
            i++;
            sum += i;
        };
        System.out.println(sum);
        return sum;
    };
    //---------------------------------

    public double getTotalAmount(double[] prices){
        double sum = 0;
        for(int i = 0; i < prices.length; i++){
            System.out.println(i);
            sum += prices[i];
        };
    return sum;
    };
    //---------------------------------

    public void printMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    };
    //---------------------------------

};