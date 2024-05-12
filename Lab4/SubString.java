import java.util.*;
public class SubString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
         
        System.out.println("Enter the starting index:");
        int n=sc.nextInt();
        System.out.println("Enter the ending index:");
        int e=sc.nextInt();
        
        System.out.println(s.substring(n,e));

        sc.close();

    }
    
}
 