public class UsingArrays {

    public static void main(String[] args) {

        // Q: What is an array?
        // Q: What type of data can be stored inside of an array?
        // Q: What is the main difference between arrays and other collection types?

        // Q: How do you declare an array?
        double[] temperatures;
        //String[] args; // This is the parameter from our main method!

        // It's also okay to say, but is more prefered to do the first way
        double temperatures2[];
        String args2[];

        // After declaring, we need to initialize a size to the array:
        temperatures = new double[15];

        // Now we have an array that can take up to 15 "double" values (can't hold more than 15!)
        // Q: What's inside of our array right now?

        System.out.println(temperatures);
        // What is happening? Why did we get that result?

        System.out.println("==================================================");

        // A: We need to loop through the array to find the specific value:
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Index: " + i + "\t" + "Value: " + temperatures[i]);
        }

        System.out.println("==================================================");

        // Q: How do we assign values to the array?
        temperatures[0] = 1.1;
        temperatures[1] = 2.2;
        temperatures[2] = 3.3;
        temperatures[3] = 4.4;
        temperatures[4] = 5.5;
        temperatures[5] = 6.6;
        temperatures[6] = 7.7;
        temperatures[7] = 8.8;
        temperatures[8] = 9.9;
        temperatures[9] = 10.10;
        temperatures[10] = 11.11;

        // Let's print our array again!
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Index: " + i + "\t" + "Value: " + temperatures[i]);
        }
    }

}
