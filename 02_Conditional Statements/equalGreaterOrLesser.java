import java.util.*;
public class equalGreaterOrLesser{

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
      
      //Equal or Greater or Lesser Check
        if (a==b) {
            System.out.println("Both are equal");
        }

        else if (a>b) {
            System.out.println("a is greater than b");

        }

        else {
            System.out.println("a is lesser than b");
        }

    }
}
