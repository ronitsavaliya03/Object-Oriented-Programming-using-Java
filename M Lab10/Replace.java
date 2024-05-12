import java.io.*;
public class Replace {
    public static void main(String[] args) {
        String word1="Parth";
        String word2="Ronit";

        try{
            File f1=new File("parth.txt");
            File f2=new File("ronit.txt");

            BufferedReader r1=new BufferedReader(new FileReader(f1));
            BufferedWriter w1=new BufferedWriter(new FileWriter(f2));

            String s = r1.readLine();
            String fina="";
            int c=0;

            while (s!=null) {
                String ch = "";
                String a[] = s.split(" ");

                for(int i=0;i<a.length;i++){
                    if(a[i].equals(word1)){
                        c++;
                        ch += word2+" ";
                    }else{
                        ch += a[i]+" ";
                    }
                }

                fina+=ch;
                s = r1.readLine();
            }

            w1.write(fina);
            w1.close();
            r1.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
