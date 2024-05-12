import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int []a=new int[4];
        int sum=0;
        
        for(int i=0;i<4;i++){
            System.out.println("Enter the value:");
            a[i]=sc.nextInt();

            sum+=a[i];
        }

        System.out.println("Answer:"+(sum/4));


        sc.close();
    }
    
}
