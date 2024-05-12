//find the largest prime number between 1008 and 9008.
public class Prime {
    public static void main(String[] args) {
        int n;
        int count=0;

        for(int i=1008;i<=9008;i++){
            if(n%i==0){
                count+=1;
            }
            System.out.println(i);
        }

        System.out.println(count);

    }
    
}
