// The Transport interface declares a deliver () method. The abstract class Animal is the super class of the Tiger, Camel, Deer 
// and Donkey classes. The Transport interface is implemented by the Camel and Donkey classes. Write a test program that 
// initialize an array of four Animal objects. If the object implements the Transport interface, the deliver () method is invoked.
interface Tranport{
    public void deliver();

}
abstract class Animal{
    public void deliver(){
        //code
    }
}
class Tiger extends Animal{

}
class Camel extends Animal implements Tranport{
    public void deliver(){
        System.out.println("camel");
    }

}
class Deer extends Animal{
    
}
class Donkey extends Animal implements Tranport{
    public void deliver(){
        System.out.println("U donkey");
    }
}
public class Try {
    public static void main(String[] args){
        Animal[] a1 = new Animal[4];
        a1[0] = new Tiger();
        a1[1] = new Camel();
        a1[2] = new Deer();
        a1[3] = new Donkey();
        for(int i=0 ; i<a1.length ; i++){
            a1[i].deliver();
        }
    }
}
