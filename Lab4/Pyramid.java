import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input= sc.nextLine();

        for(int i=0;i<input.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
    
}
