import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the radias of circle:");
        double r = sc.nextDouble();

        double area=(22.0/7)*r*r;

        System.out.println("Area of Circle is:"+ area);

        sc.close();


    }
}