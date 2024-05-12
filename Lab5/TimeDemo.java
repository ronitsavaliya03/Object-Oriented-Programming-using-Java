import java.util.Scanner;
public class TimeDemo{
    public static void main(String[] args) {
        Time t1= new Time();
        t1.getDetails();
        Time t2= new Time();
        t2.getDetails();

        t1.addTime(t2);
        t1.print();   
    }
    
}
class Time {
    int hour;
    int minute;
    int second;

    public Time(){
		hour = 0;
		minute = 0;
		second = 0;
	}

    void print(){
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }

    void addTime(Time T){
        //Time ans=new Time();
        this.hour = this.hour + T.hour;
		this.minute = this.minute + T.minute;
		this.second = this.second + T.second;


        while(this.second>=60) {
            if(this.second>=60){
                //this.second-=60;
                this.minute++;
            }
            this.second-=60;
        }    
        while (this.minute>=60){
            if(this.minute>=60){
                //this.minute-=60;
                this.hour++;
            }
            this.minute-=60;
        }
    }

    void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Hour:");
        hour=sc.nextInt();
        System.out.println("Enter the Minute:");
        minute=sc.nextInt();
        System.out.println("Enter the Second:");
        second=sc.nextInt();

    }
    
}

