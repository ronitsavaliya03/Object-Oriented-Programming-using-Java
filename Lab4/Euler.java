import java.util.Scanner;
public class Euler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("value of xn:");
        double xn=sc.nextDouble();

        System.out.println("value of x0");
        double x0=sc.nextDouble();
 
        System.out.println("value of y0");
        double y0=sc.nextDouble();

        System.out.println("size of step:");
        double h=sc.nextDouble();

        double m=(xn-x0)/h;
        System.out.println(m);

        int m1=(int)m;
        System.out.println(m1);

        double []x=new double[m1+1];
        double []y=new double[m1+1];

        x[0]=x0;
        y[0]=y0;
        System.out.println(x[0]);
        for(int i=0;i<=(m1-1);i++){

            x[i+1]=x[i] + h;
            System.out.println("x"+ (i+1) +"="+ x[i+1]);

            y[i+1]=y[i]+ h*(x[i]+y[i]+(x[i]*y[i]));
            System.out.println("y"+ (i+1) +"="+ y[i+1]);

            System.out.println("------------------------");

        }
        sc.close();
    }
    
}
