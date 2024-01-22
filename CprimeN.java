package Java;

import java.util.Scanner;

public class CprimeN {
    public static void main(String[] args) {
        int no,temp=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number: ");
        no=ob.nextInt();
        for(int i=2; i<=no-1; i++){
            if (no%i==0) {
                temp=temp+1;
            }
        }
        if (temp>0) {
            System.out.println(no+" is not prime");
        }
        else{
            System.out.println(no+" is prime number");
        }
    }
    
} 
