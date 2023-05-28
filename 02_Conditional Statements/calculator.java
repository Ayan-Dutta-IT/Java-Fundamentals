import java.util.*;
public class calculator{
    public static void main (String args[]) {
    
        //Question 1
        //Calculator to perform operations such as +,-,*,/,%
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Press 1 for +(Addition)");
        System.out.println("Press 2 for -(Subtraction)");
        System.out.println("Press 3 for *(Multiplication)");
        System.out.println("Press 4 for /(Division)");
        System.out.println("Press 5 for %(Modulo or remainder)");
        System.out.println("Enter your choice:");
        int c= sc.nextInt();
        switch (c) {
            case 1:
            System.out.println(a+b); 
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            case 5:
            System.out.println(a%b);
            break;
            default:
            System.out.println("Invalid");
        } 
    }
}
