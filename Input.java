package Java;

import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        //Getting User Input
        Scanner Ob = new Scanner(System.in) ;
            System.out.println("Enter Name");
            String name=Ob.next();
            System.out.println("Enter Gender");
            char gender=Ob.next().charAt(0);
            System.out.println("Enter Age");
            int age=Ob.nextInt();
            System.out.println("Enter phone number");
            long phone=Ob.nextLong();

            System.out.println("\n\nName: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Age: "+age);
            System.out.println("Phone: "+phone);
        
    }
}
