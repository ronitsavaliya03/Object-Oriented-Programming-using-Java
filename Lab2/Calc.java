import java.util.Scanner;
public class Calc{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();

        System.out.print("Enter your sign:");
        char c =sc.next().charAt(0);

        switch (c) {
            case '+':System.out.println("a+b="+(a+b));
            break;
            case '-':System.out.println("a-b="+(a-b));
            break;
            case '*':System.out.println("a*b="+(a*b));
            break;
            case '/':System.out.println("a/b="+(a/b));
            break;
            default:System.out.println("Invalid operator.!");
            break;
        
                }

            sc.close();

    }
}