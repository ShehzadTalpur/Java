package Java;

import java.util.Scanner;

public class Factorial {
    static int fact=1;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int no=s.nextInt();
        Factorial ob=new Factorial();
        ob.calFact(no);
        System.out.println("Factorial of "+no+" is "+fact);
    }
    void calFact(int no){

        if (no>=1) {
            fact=fact*no;
            calFact(no-1);
        }
}
}
