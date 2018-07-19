import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Q: What is an arraylist?
        // Q: How is it different than an array?

        // Declare and initialize an arraylist
        ArrayList<String> names = new ArrayList<>();

        // Adding names to the arraylist (it's in a set chronologically order!)
        names.add("Diem");
        names.add("Josh");
        names.add("Elias");
        names.add("TK");
        names.add("Tsigerada");
        names.add("Perry");
        names.add("Shabnam");
        names.add("Feben");

        //Method #1 : Iterate using for loop
        System.out.println("Using for loop: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("==================================================");

        //Method #2 : Iterate using advanced for loop
        System.out.println("Using Advanced for loop: ");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("==================================================");

        //Method #3 : Iterate using advanced for loop
        System.out.println("Using Iterator: ");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==================================================");

        //Method #4 : Iterate using while loop
        System.out.println("Using while loop: ");
        int index = 0 ;
        while (names.size()> index) {
            System.out.println(names.get(index));
            index++ ;
        }

    }

}
