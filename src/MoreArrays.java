import java.util.Random;

/*
* More things you can do with an array.
 */
public class MoreArrays {

    public static void main(String[] args) {

        Random rnd = new Random();
        int randomInt;

        // Declare array to hold ten test scores
        int[] scores = new int[10];

        // Initialize elements of the array
        for (int i = 0; i < 10; i++) {
            randomInt = 1 + rnd.nextInt(100);
            scores[i] = randomInt;
        }

        // Print the elements of the array
        for (int i = 0; i < 10; i++) {
            System.out.printf("Element # %d value is %d\n", i, scores[i]);
            //System.out.println("Element # " + i + " value is " + scores[i]);
        }

        System.out.println("==================================================");

        // Print the fifth element
        System.out.println("The fifth value is: " + scores[4]);

        System.out.println("==================================================");

        // Print every other element
        for (int i = 0; i < 10; i+=2) {
            System.out.printf("Element # %d value is %d\n", i, scores[i]);
        }

        System.out.println("==================================================");

        // Print the number of the elements
        System.out.println("The array length is " + scores.length);

        System.out.println("==================================================");

        /// Change an element
        scores[0] = 100;
        System.out.println("The first element is now " + scores[0]);

        System.out.println("==================================================");

        // This line will generate an ArrayIndexOutOfBoundsException
        System.out.println(scores[10]);

    }

}
