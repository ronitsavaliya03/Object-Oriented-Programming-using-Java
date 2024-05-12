public class SuperDemo {
   public static void main(String[] args) {
       Student a=new Student(6.11,102);

       System.out.println(a);
   }
}
class Human{
   int age;
   String name;

   Human(){
      age=8;
      name="ronit";
      System.out.println(age+" "+name);
   }
   Human(int age,String name){
      this.age=age;
      this.name=name;
      System.out.println(age+" "+name);
   }
}
class Student extends Human{
   double SPI=4.55;
   int enroll=56489;

   Student(){
      super(20,"me");
      SPI=10;
   }
   Student(double SPI,int enroll){
      super();
   }
}