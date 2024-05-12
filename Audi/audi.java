
class Box {
    int w;
    int b;
    int h;

    //access_specifies
    public void setData(int width, int breadth, int height){
        w = width;
        b = breadth;
        h = height;
    }
    public void printVol(){
        int ans = w* b*h;
        System.out.println(ans);
    }
    public Box addHeight(int height){
        Box temp= new Box();
        temp.h = height+h;
        temp.b = b;
        temp.w = w;

        return temp;
    }

}
public class audi {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        // myBox1.setData(2, 5, 6);
        // myBox1.addHeight(5);
        // myBox1.printVol();


        //immutable 
        myBox1.setData(2, 5, 6);
        Box ans = myBox1.addHeight(5);
        ans.printVol();
    }
}
