import java.util.Scanner;
public class Remark{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the marks per subject:");
        int mark= sc.nextInt();

        System.out.println("Enter the marks of Mathematics:");
        int a= sc.nextInt();
        System.out.println("Enter the marks of DF:");
        int b= sc.nextInt();
        System.out.println("Enter the marks of CPC:");
        int c= sc.nextInt();
        System.out.println("Enter the marks of Physics:");
        int d= sc.nextInt();
        System.out.println("Enter the marks of ES:");
        int e= sc.nextInt();

        double per=(double)(a+b+c+d+e)*100/(5*mark);

        System.out.print("Presentage:"+per);
        System.out.println("%");

        if(per>90){
            System.out.println("A++");
        }
        else if(per>70){
            System.out.println("A+");
        }
        else if(per>60){
            System.out.println("A");
        }
        else if(per>40){
            System.out.println("B+");
        }
        else if(per<39){
            System.err.println("Opps! you fail..");
        }

        sc.close();
    }
    
}
