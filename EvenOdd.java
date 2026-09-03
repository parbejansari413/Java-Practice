import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("The num is Even. ");


        }else{
            System.out.println("The num is odd. ");
        }
        sc.close();
    }
    
}
