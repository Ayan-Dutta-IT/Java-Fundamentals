import java.util.*;
public class greeting{

    public static void main(String args[]) { 
      
      //Print the greeting
        //1 for hello
        //2 for namaste
        //3 for bonjour    
        
        Scanner sc= new Scanner(System.in);
        int click= sc.nextInt();

        switch (click) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default: System.out.println("Invalid");
        }
    }
}
