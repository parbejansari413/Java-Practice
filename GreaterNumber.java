import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter a num2: ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("The num1 is Greater: ");

        } else {
            System.out.println("The num1 is not Greater: ");


        }
        sc.close();

    }    
}
