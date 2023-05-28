public class input{

    public static void main(String args[]) {
        //Input
            Scanner sc = new Scanner(System.in);
            String namey = sc.nextLine();
        
        //next()
        //nextLine()
        //nextInt()
        //nextFloat()
            System.out.println(namey);

        //Question 1
        //Take two imput variables a and b and print their sum
            Scanner cc= new Scanner(System.in);
            int a = cc.nextInt();
            int b = cc.nextInt();
            int sum2 = a+b;
            System.out.println(sum2);
      //Question 2
      //Take diameter of a circle as input and calculate its radius and area to show the result
        System.out.println("Enter the diameter of the circle:");
        Scanner sc = new Scanner(System.in);
        double diameter= sc.nextDouble();
        double radius= diameter/2;
        double area = 3.14*radius*radius;
        System.out.print("Radius of the circle:");
        System.out.println(radius);
        System.out.print("Area of the circle:");
        System.out.println(area);
     //Question 3
     //Print table of a number input by user
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(a*1);
        System.out.println(a*2);
        System.out.println(a*3);
        System.out.println(a*4);
        System.out.println(a*5);
        System.out.println(a*6);
        System.out.println(a*7);
        System.out.println(a*8);
        System.out.println(a*9);
        System.out.println(a*10);
    }
}
