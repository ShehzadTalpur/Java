package Java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Create calculator using switch case

      String yn;
      do {
          Scanner Ob=new Scanner(System.in);
              int no1,no2,res;
              String sym;
              System.out.println("Enter 1st Value");
              no1=Ob.nextInt();
              System.out.println("Enter 2nd Value");
              no2=Ob.nextInt();
              System.out.println("Select Symbol: +,-,*,/");
              sym =Ob.next();

        switch (sym) {
            case "+":res=no1+no2;
                System.out.println("Addition is: "+res);
                break;
        
                case "-":res=no1-no2;
                System.out.println("Subtraction is: "+res);
                break;

                case "*":res=no1*no2;
                System.out.println("Multiplication is: "+res);
                break;

                case "/":res=no1/no2;
                System.out.println("Division is: "+res);
                break;

            default:
            System.out.println("Invalid Symbol");
                break;
        }
        System.out.println("Do you want to continue(Press y for 'Yes' and n for 'No')");
        yn=Ob.next();
      } while (yn.equals("Y") || yn.equals("y"));

    }
    
}
