import java.util.*;
public class primeOrNot{
    public static void main(String args[]) {
    
    //Question 4
    //Print a number n input is prime or not
      Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int prime=0;
        int nprime=0;
        for (int i=n;i>0;i--) {
         if (i==n || i==1) {
                int j=n%i;
                if (j==0) {
                    prime++;
                }
            }
            else {
                int k=n%i;
                if (k==0) {
                    nprime++;
                }
                else {
                    continue;
                }
            }
        }
        if (prime==2 && nprime==0) {
           System.out.println("The number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}
