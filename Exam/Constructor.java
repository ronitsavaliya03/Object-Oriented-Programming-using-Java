class Rect{
    int len;
    int wid;
    boolean isFilled;

    public Rect(int l,int w, boolean isF){
        len=l;
        wid=w;
        isFilled =isF;
    }

}
public class Constructor {
    public static void main(String[] args) {
        Rect r1=new Rect(6,6,true);
        System.out.println((r1.len)+"\n"+(r1.wid));
    }    
}
