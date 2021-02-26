import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> books = new ArrayList<>();
        books.add("book a");
        books.add("book b");
        books.add("book c");
        books.add("book d");
        books.add("book e");

        for(String i : books){
            System.out.println(i);
        }

        books.remove(4);
        for(String i : books){
            System.out.println(i);
        }

        books.set(3,"book e");
        System.out.println(books.get(3));

        books.clear();

        books.add("planned book a");
        books.add("planned book b");
        books.add("planned book c");
    }
}
