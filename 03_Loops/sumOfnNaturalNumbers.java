import java.util.*;
public class sumOfnNaturalNumbers{
    public static void main(String args[]) {
      
        //Question 1
        //Print the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n)    {
            sum=sum+i;
            i=i+1;
        }
        System.out.println("Sum of first "+n+" natural numbers is "+sum);
    }
}
