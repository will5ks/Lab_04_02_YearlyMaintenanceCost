public class Main {
    public static void main(String[] args) {
        //Declarations
        double spring;
        double summer;
        double fall;
        double winter;
        double yearlyCost;

        //User Prompt 1
        System.out.println("Enter your spring home maintenance costs.");

        //User Input Simulation 1
        System.out.println("1500");
        spring = 1500;

        //User Prompt 2
        System.out.println("Enter your summer home maintenance costs.");

        //User Input Simulation 2
        System.out.println("2500");
        summer = 2500;

        //User Prompt 3
        System.out.println("Enter your fall home maintenance costs.");

        //User Input Simulation 3
        System.out.println("2000");
        fall = 2000;

        //User Prompt 4
        System.out.println("Enter your winter home maintenance costs.");

        //User Input Simulation 4
        System.out.println("1000");
        winter = 1000;

        //Calculate the Yearly Home Maintenance Costs
        yearlyCost = spring + summer + fall + winter;

        //Output to User
        System.out.println("Your yearly home maintenance costs are $" + yearlyCost + ".");
    }
}
