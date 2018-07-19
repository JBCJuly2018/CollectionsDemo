import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // Q: What is a HashMap?
        // Q: When would you want to use a hash map?

        // Declare and intialize a hashmap with a pair <key, value> for <seat number, name>
        HashMap<Integer, String> classRoster = new HashMap<>();

        // Adding values to the hashmap (using .put())
        classRoster.put(1, "Diem");
        classRoster.put(3, "Elias");
        classRoster.put(4, "TK");
        classRoster.put(5, "Perry");
        classRoster.put(8, "Josh");
        classRoster.put(11, "Tsigerada");
        classRoster.put(12, "Shabnam");
        classRoster.put(13, "Feben");

        // Retrieving a specific value from the hashmap by using .get()
        System.out.println("The value at the key # 12 is: " + classRoster.get(12));

        System.out.println("==================================================");

        // Q: What if we tried to get a key that doesn't exist?
        // A: ??
        System.out.println("The value at key # 2 is: " + classRoster.get(2));

        System.out.println("==================================================");

        // Solution: Check if key exists first using .containsKey() <-- will return a boolean value (true or false)
        System.out.println("Do I have a value at key # 2? " + classRoster.containsKey(2));

        System.out.println("==================================================");

        // Q: How do I view all the elements of my hashmap?
        // A: iterating over keys only
        for (Integer key : classRoster.keySet()) {
            System.out.println("Key = " + key);
        }

        System.out.println("==================================================");

        // A: iterating over values only
        for (String value : classRoster.values()) {
            System.out.println("Value = " + value);
        }

        System.out.println("==================================================");

        // A: iterating over keys and values
        for (Integer key : classRoster.keySet()) {
            System.out.println("Key = " + key + ": " + "Value = " + classRoster.get(key));
        }
    }

}
