package Java;

import java.util.Scanner;

public class RevS {
    public static void main(String[] args) {
        String name,Rev="";
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=ob.nextLine();
        int leng=name.length();
        for(int i=leng-1; i>=0; i--){
            Rev=Rev+name.charAt(i);
        }
        System.out.println("Reverse of "+name+" is "+Rev);
    }
}
