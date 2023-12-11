import java.util.ArrayList;
import java.util.Arrays;

class example {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2, 8);
        // System.out.println(numbers);
        // ArrayList<String> testArray = new ArrayList<String>(12); // empty arrayList
        ArrayList<String> testArray1 = new ArrayList<String>(Arrays.asList("Test1", "test2", "test3", "test4"));
        testArray1.add(1, "testinsert");
        // System.out.println(testArray1);

        // access elements from ArrayList
        System.out.println(testArray1.get(3));
        System.out.println(testArray1.get(1));
    }
}