import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int digit,temp=0;
        int n=a;

        while (a!=0) {
            digit=a%10;
            temp=(temp*10)+digit;
            a=a/10;
        }

        if(n==temp){
            System.out.println("Number is Palindrome.");
        }
        else{
            System.out.println("Number is not Palindrome.");
        }
        sc.close();

    }
}