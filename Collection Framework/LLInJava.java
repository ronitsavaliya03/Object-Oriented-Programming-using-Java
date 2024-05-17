import java.util.LinkedList;

public class LLInJava {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("Hello");
        list.addFirst("Heyy!");
        System.out.println(list);

        list.addLast("ronit");
        //By default Last
        list.add("savaliya");
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("--------------------------------------------");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        System.out.println("--------------------------------------------");


        list.removeLast();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.addFirst("Heyy!");
        list.add("savaliya");
        list.remove(1);
        System.out.println(list);

    }
}
