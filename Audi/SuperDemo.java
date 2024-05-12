class MovingObject{
    int noOfGears=20;
}
class Vehicle extends MovingObject{
    int noOfGears=5;
    public int getSuper(){
        return super.noOfGears;
    }
}
class Car extends Vehicle{
    int noOfGears=10;
    Car(){

    }

    public void printGear(){
    int noOfGears=15;
        System.out.println("Local =" + noOfGears);
        System.out.println("insta =" + this.noOfGears);
        System.out.println("parent property = " + super.noOfGears);
        System.out.println("Super Super = " + super.getSuper());
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.printGear();
    }
}
