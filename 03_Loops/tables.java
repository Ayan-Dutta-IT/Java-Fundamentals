import java.util.*;
public class tables{
    public static void main(String args[]) {
    
    //Question 2 
    //Print table of a user defined number
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number for which you want table:");
        int n= sc.nextInt();
        System.out.println("Enter upto which you want:");
        int k=sc.nextInt();
        int i=1;
        while (i<=k) {
            System.out.println(n+"x"+i+"="+n*i);
            i=i+1;
        }
    }
}
