import java.util.*;
public class ageCheck{

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();


        //Age Check

        if (age>= 18) {
           System.out.println("You are an adult"); 
        }
        else if (age==17) {
            System.out.println("You will be an adult soon");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
