import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int []a=new int[5];
        
        for(int i=0;i<5;i++){
            System.out.println("Enter the value of a["+a[i]);
            a[i]=sc.nextInt();

        }
        for(int i=5;i>0;i--){
            System.out.println("the value of"+a[i]);
          
        }
        sc.close();
    }
    
}
