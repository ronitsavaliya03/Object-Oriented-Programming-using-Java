import java.util.Scanner;
public class Vowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your String:");
        String s = sc.nextLine();
        int vowel=0,consonent=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowel++;
            }
            else{
                consonent++;
            }

        }
        System.out.println("Vowels:"+vowel);
        System.out.println("Consonents:"+consonent);

        sc.close();

    }
    
}
