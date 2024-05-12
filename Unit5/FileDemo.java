import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f1= new File("FileDemo.java");
        System.out.println("File Name: "+ f1.getName());
        System.out.println("Path: "+f1.getPath());
        System.out.println("Abs Path: "+ f1.getAbsolutePath());
        System.out.println("Parent: "+ f1.getParent());
        System.out.println((f1.exists() ? "exists" : "does not exists"));
        System.out.println(f1.canWrite() ? "is " : "is not");
        System.out.println(f1.canRead() ? "is " : "is not");
        System.out.println(f1.lastModified());


    }
    
}
