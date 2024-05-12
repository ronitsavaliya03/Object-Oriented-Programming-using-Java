// Declare a class called student having following data members:id_no, no_of_subjects_registered, subject_code, 
// subject_credits, grade_obtained and spi. Deƒne constructor and calculate_spi methods.Deƒne main to instantiate an array 
// for objects of class student to process data of n students to be given as command line arguments

class Student{
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    public Student(int id_no,int no_of_subjects_registered,String[] subject_code,int[] subject_credits,char[] grade_obtained,double spi){
        this.id_no=id_no;
        this.no_of_subjects_registered=no_of_subjects_registered;
        this.subject_code=subject_code;
        this.subject_credits=subject_credits;
        this.grade_obtained=grade_obtained;
        this.spi=spi;
    }
    public void calculateSPI(){
        int totalCredits=0;
        int pointsEarns=0;

        for(int i=0;i<no_of_subjects_registered;i++){
            int gradePoints=gradeToPoint(grade_obtained[i]);
            pointsEarns+=gradePoints*subject_credits[i];
            totalCredits+=subject_credits[i];
       }
       if(totalCredits>0){
        spi=pointsEarns/(double)totalCredits;
       }
    }

    private int gradeToPoint(char grade){
        switch(grade){
            case 'A':return 10;
            case 'B':return 8;
            case 'C':return 6;
            case 'D':return 4;
            case 'E':return 2;
            case 'F':return 0;
            default: return 0;
        }
    }

}
public class SPI {
    public static void main(String[] args) {
        String[] subjectCodes={"CS104","MA205"};
        int[] subjectCredits={4,3};
        char[] gradesObtained={'D','F'};

        Student student=new Student(1, 2, subjectCodes, subjectCredits, gradesObtained,0);
        student.calculateSPI();

        System.out.println("Student ID: "+ student.id_no + "\nSPI: "+ student.spi);

    }
}
