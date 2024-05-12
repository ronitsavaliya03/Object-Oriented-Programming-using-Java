abstract class Vegetable {
    String name;
    String color;
}
class Potato extends Vegetable{
    public Potato(String a,String b){
        name=a;
        color=b;
    }
    public String toString(){
        return name+" is a "+color;
    }
}
class Brinjal extends Vegetable{
    public Brinjal(String a,String b){
        name=a;
        color=b;
    }
    public String toString(){
        return name+" is a "+color;
    }
}

class Tomato extends Vegetable{
    public Tomato(String a,String b){
        name=a;
        color=b;
    }
    public String toString(){
        return name+" is a "+color;
    }
}
public class Temp{
    public static void main(String[] args) {
        Potato p1=new Potato("Potato","Skin");
        System.out.println(p1);
        Brinjal b1=new Brinjal("Brinjal","Purple");
        System.out.println(b1);
        Tomato t1=new Tomato("Tomato","Red");
        System.out.println(t1);
    }
}