import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter temp. in F.:");
        double F = sc.nextDouble();

        System.out.print("C="+((F-32.0)*(5/9.0)));

        sc.close();

    }
}