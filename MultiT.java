package Java;

import java.util.Scanner;

public class MultiT {
    public static void main(String[] args) {
        //Print multiplication table
        int t;
        Scanner Ob=new Scanner(System.in);
        System.out.println("Please enter number");
        t=Ob.nextInt();
        System.out.println("\nTable of "+t+"\n");
        for(int i =1; i<=12;i++){
            System.out.println(t+" x "+i+" = "+t*i);
            
        }
    }
    
}
