import java.util.*;
public class marksRemarks{
    public static void main(String args[]) {
    
     //Question 3
    //Make menu driven program to choose from 0 and 1, if 1 then take input of marks if 0 then stop and print remarks for certain marks range
    int op=1;
        while (op>0) {
        System.out.println("1-->To enter marks");
        System.out.println("0-->To stop");
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        switch (n) {
           case 1:
           System.out.println("Enter your marks:");
            int a=sc.nextInt();
            if (a>=90 && a<=100) {
                System.out.println("This is Good");
            } 
            else if (a>=60 && a<=89) {
                System.out.println("This is also Good");
            }
            else if (a>=0 && a<=59) {
                System.out.println("This is Good as well");
            }
            else {
                System.out.println("Invalid");
            }
            break;
            case 0:
            System.out.println("Stop");
            op=0;
            break;
            default:
            System.out.println("Invalid");
        }
        }
    }
}
