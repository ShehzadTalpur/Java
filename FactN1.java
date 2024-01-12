package Java;

import java.util.Scanner;

public class FactN1 {
    public static void main(String[] args) {
    //Fint the factorial of the number
     int no,fact=1;
    Scanner Ob=new Scanner(System.in);
    System.out.println("Please enter Digit");
    no=Ob.nextInt();
    for(int i=no;i>=1;i--){
        fact=fact*i;
    }
System.out.println("Factorial of "+no+" is "+fact);

}
    
}
