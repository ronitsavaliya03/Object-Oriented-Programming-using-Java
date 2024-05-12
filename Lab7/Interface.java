// Write a program that illustrates interface inheritance. Interface A is extended by A1 and A2. Interface A12 inherits from both 
// A1 and A2.Each interface declares one constant and one method. Class B implements A12.Instantiate B and invoke each of 
// its methods. Each method displays one of the constants
interface A{
    final double e=46543;
    public void printe();
}
interface A1 extends A{
    final double pi=3.14;
    public void printpi();
}
interface A2 extends A{
    final double a=1;
    public void printa();
}
interface A12 extends A1, A2{
    final double b=46;
    public void printb();
}
class B implements A12{
    public void printe(){
        System.out.println(e);
    }
    public void printpi(){
        System.out.println(pi);
    }
    public void printa(){
        System.out.println(a);
    }
    public void printb(){
        System.out.println(b);
    }
}

public class Interface {
    public static void main(String[] args) {
        B b=new B();
        b.printa();
        b.printb();
        b.printe();
        b.printpi();        
    }    
}
