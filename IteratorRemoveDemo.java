import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveDemo {

    public static void main(String[] args) {

        // Method 1: Using for-each loop
        List<Integer> numbers1 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        System.out.println("Using for-each loop:");
        System.out.println("Original list: " + numbers1);

        try {
            for (Integer number : numbers1) {

                if (number % 2 == 0) {
                    numbers1.remove(Integer.valueOf(number));
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException occurred!");
        }

        System.out.println("List after for-each: " + numbers1);


        // Method 2: Using Iterator
        List<Integer> numbers2 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        System.out.println("\nUsing Iterator:");
        System.out.println("Original list: " + numbers2);

        Iterator<Integer> iterator = numbers2.iterator();

        while (iterator.hasNext()) {

            Integer number = iterator.next();

            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("List after Iterator: " + numbers2);
    }
}
