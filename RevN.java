package Java;

import java.util.Scanner;

public class RevN {
    
public static void main(String[] args) {
    
int no, rem, rev=0;
Scanner ob= new Scanner(System.in);
System.out.println("Enter Number");
no=ob.nextInt();
while (no !=0) {
    rem=no%10;
    rev=rev*10+rem;
    no=no/10;
}
System.out.println(rev);
    
}

}
