import java.util.Scanner;
public class PalString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your String:");
        String s = sc.nextLine();

        int n=s.length();
        int start=0,end=n-1;
        boolean check=true;

        while (start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                check=false;
                break;
            }
            start++;
            end--;
        }
        // s=s.toLowerCase();
        // for (int i = 0; i < s.length()/2; i++) {
        //     if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
        //         System.out.println("String is not palindrom.");
        //         break;
        //     }
        //     if (i==s.length()/2-1) {
        //         System.out.println("String is palindrom.");
        //     }
        // }

        if(check){
            System.out.println("String is palindrome.");
        }
        else{
            System.out.println("String is not palindrome.");
        }

        sc.close();


    }
    
}
