import java.util.Scanner;

public class ArithmeticOperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number-1 :- ");
        int num1=sc.nextInt();
        System.out.println("Enter the number-2 :- ");
        int num2=sc.nextInt();

        System.out.println("List of options:-");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Choose one option : ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
             System.out.println("Addition");
             break;
            }
            case 2:{
                System.out.println("Subtraction");
                break;
            }
            case 3:{
                System.out.println("multiplication");
                break;
            }
            case 4:{
                System.out.println("Division");
                break;
            }
            default:
             System.out.println("Invalid choice");
        }//switch
    }//main
}//class