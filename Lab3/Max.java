import java.util.Scanner; 
public class Max {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your a num:");
        int a =sc.nextInt();
        System.out.println("Enter your b num:");
        int b =sc.nextInt();
        System.out.println("Enter your c num:");
        int c =sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is Max");
            }
            else{
                System.out.println("c is Max");
            }
        }
        else{
            if(b>c){
                System.out.println("b is Max");
            }
            else{
                System.out.println("c is Max");
            }
        }



        sc.close();
    }
    
}
