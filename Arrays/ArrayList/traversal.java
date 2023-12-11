import java.util.ArrayList;

public class traversal {
    public static void main(String[] args) {

        ArrayList<String> test = new ArrayList<String>();
        test.add("A");
        test.add("B");
        test.add("C");
        test.add("D");
        test.add("E");
        for (int i = 0; i < test.size(); i++) {
            String s = test.get(i);
            System.out.println(s);
        }

        // search an element
        for (String s : test) {
            if (s.equals("F")) {
                System.out.println("The element is found");
                break;
            }
        }
        // using indexof
        int index = test.indexOf("C");
        System.out.println("The element is found at index: " + index);

        // Delete an element
        test.remove("D");
        System.out.println(test);
    }
}
