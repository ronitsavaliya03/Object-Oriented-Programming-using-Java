class Thread1 extends Thread{
    public void run(){
        try{Thread.sleep(1000);
            System.out.println("Good Morning");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        try{Thread.sleep(2000);
            System.out.println("Good Afternoon");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        t2.start();

    }
    
}
