import java.util.Scanner;

public class Kvadratická {
    public void Uloha11()
    {
        Scanner in=new Scanner(System.in);
        double a, b, c;
        System.out.println("Input a: ");
        a= in.nextInt();
        System.out.println("Input b: ");
        b= in.nextInt();
        System.out.println("Input c: ");
        c= in.nextInt();
        if (a==0)
        {
            System.out.println("Nie je to KV.");
        }
        double D= (b*b)-4*a*c;
        if (D<0)
        {
            System.out.println("Nemá korene");
        }
        if (D==0)
        {
            double x=(b*(-1))/(2*a);
            System.out.println("riesenie je:" +x);
        }
        if (D>0)
        {
            double x1=((b*-1)+ java.lang.Math.sqrt(D))/(2*a);
            double x2=((b*-1)- java.lang.Math.sqrt(D))/(2*a);
            System.out.println("x1: "+x1);
            System.out.println("x2: "+x2);
        }
}
