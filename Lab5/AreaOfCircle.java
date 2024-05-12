import java.util.Scanner;
class circle{
    double radius;
    
void area(){
    System.out.println(Math.PI*radius*radius);
}
}

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        circle r1=new circle();
        r1.radius=n;

        r1.area();

        sc.close();
    }
}
