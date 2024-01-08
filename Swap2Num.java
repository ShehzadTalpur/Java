package Java;

public class Swap2Num {
    public static void main(String[] args) {
        int a=10,b=20;
        //Swap with third variable
        int t;

        t=a;
        a=b;
        b=t;

        System.out.println("a="+a);
        System.out.println("b="+b+"\n");

        //Swap without third variable

        int c=10, d=20;

        c=c+d;
        d=c-d;
        c=c-d;

        System.out.println("c="+c);
        System.out.println("d="+d);

    }
}
