import java.util.*;
public class printTillN{
    public static void main(String args[]) {
    
    //Question 1
    //Print all numbers till n
      Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==0){
            for (int i=n;i>=0;i=i-2){
                System.out.println(i);
            }
        
        }
        else {
            System.out.println("Number is odd");
        }
    
    }
}
