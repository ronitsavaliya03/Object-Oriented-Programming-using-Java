import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input= sc.nextLine();

        int length= input.length();

        int n=length/2;
        String secondHalf=input.substring(n);

        System.out.println("Length of string:"+length);
        System.out.println("Seconnd half of the string:"+secondHalf);

        sc.close();
     }    
}
