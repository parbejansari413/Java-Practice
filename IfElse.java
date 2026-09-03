import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        if(marks > 40) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
        sc.close();
    }
}