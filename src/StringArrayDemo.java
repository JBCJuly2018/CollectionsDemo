public class StringArrayDemo {

    public static void main(String[] args) {

        String test = "mozzarella is the best cheese!";
        System.out.println("The length of the String is: " + test.length());
        System.out.println("The character at index 14 is: " + test.charAt(14));
        System.out.println("The portion of my word from index 4 to 14 is: " + test.substring(4,14));

        char sample = 'a';

        for (int i=0; i<test.length(); i++) {
            System.out.println("Index: " + i + "\t Letter: " + test.charAt(i));
        }

    }

}
