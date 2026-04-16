import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Choose Option:");
        System.out.println("1.ADD\n 2.SUB\n 3.MULTI\n 4.DIV\n");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result:" + (a+b));
                break;

                case 2:
                System.out.println("Result:" + (a-b));
                break;

                case 3:
                System.out.println("Result:" + (a*b));
                break; 

                case 4:
                System.out.println("Result:" + (a/b));
                break;

            default:
                System.out.println("Please choose correct option");
                break;

            
        }
    }
}
