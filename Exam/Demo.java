import java.util.Scanner;
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        age=sc.nextInt();
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Demo {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printColor();
        pen2.printColor();

        Student stu1=new Student();
        stu1.printInfo();
        Student stu2=new Student();
        stu2.printInfo();
        

    }  
}
