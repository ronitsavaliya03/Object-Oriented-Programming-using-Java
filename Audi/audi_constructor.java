 class Box1 {
    int w;
    int b;
    int h;

    public Box1(){
       System.out.println(w);
       System.out.println(b);
       System.out.println(h);
    }
}
public class audi_constructor {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();
    }
}
