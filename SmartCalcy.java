import java.util.Scanner;

class SmartCalcy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Smart Java Calcy");

        String option = "yes";

        do {
            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            System.out.println("----- Choose Opretion -----");
            System.out.println("1.Adition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n");
            int Opretion = sc.nextInt();

            switch (Opretion) {
                case 1:
                    System.out.println("Result = " + (a+b));
                    break;
                case 2:
                    System.out.println("Result = " + (a-b));
                    break;
            
                case 3:
                    System.out.println("Result = " + (a*b));
                    break;
            
                case 4:
                    System.out.println("Result = " + (a/b));
                    break;
            default:
                System.out.println("PLEASE CHOOSE CORRECT OPRETION");
                    break;
            }
            System.out.println("Do you want to continue? (yes/no)");
            option = sc.next();
        }
        while (option.equalsIgnoreCase("yes"));
        System.out.println("Thank You For Visiting..!");
    }

    
}