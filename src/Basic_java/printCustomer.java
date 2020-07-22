import java.util.Scanner;

    public class Customer{
        public static void main(String[] args)
        {
            //int age;
            //String name=null;
            //String gender=null;
            //String place=null;
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter your name:");
           String name=sc.nextLine();
           System.out.println("Enter age:");
           String age=sc.nextLine();
           System.out.println("Enter gender:");
           String gender=sc.nextLine();
           System.out.println("Hailing from:");
           String place=sc.nextLine();
           System.out.println("welcome, "+name+"!");
           System.out.println("Age:"+age);
           System.out.println("Gender:"+gender);
           System.out.println("City:"+place);

       }
   }
