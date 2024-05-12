import java.util.*;
public class ExceptionXYZ{
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        try{
            if(a!=0 && b!=0){
                System.out.println(Math.pow(a, b));
            }
            else{
                throw new MyException("Invalid input");
            }
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
        catch(NumberFormatException nfe){
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}