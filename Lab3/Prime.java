import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number:");
        int a= sc.nextInt();
        int count=0;

        for(int i=2; i<a/2;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
    }
