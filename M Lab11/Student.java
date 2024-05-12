import java.util.*;
import java.io.*;
class StudentList{
    int rollNo;
    String name;
    String email;
    int sem;

    public StudentList(int rollNo,String name,String email,int sem){
        this.rollNo=rollNo;
        this.name=name;
        this.email=email;
        this.sem=sem;
    }
}

public class Student {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("student.txt"));
            ArrayList<StudentList> students =new ArrayList<StudentList>();
            while(br.ready()){
                String temp=br.readLine();
                String[] data=temp.split(",");
                StudentList tempStu= new StudentList (Integer.parseInt(data[0]),data[1],data[2],Integer.parseInt(data[3]));
                students.add(tempStu);
                // System.out.println(data[2]);
            }
            Iterator<StudentList> itr=students.iterator();
            
            BufferedWriter bw=new BufferedWriter(new FileWriter("studentsem3.txt"));
            while (itr.hasNext()) {
                StudentList temp1=itr.next();
                // System.out.println(temp1.name);
                if(temp1.rollNo>100){
                    temp1.sem++;
                }
                bw.write(temp1.rollNo+","+temp1.name+","+temp1.email+","+temp1.sem);
                bw.newLine();
                
            }
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
