// Time complexity O(1)
// import java.util.Arrays;

class singledimensionArray {
    private int[] arr = null; // empty array

    public singledimensionArray(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
    }

    public void insert(int index, int element) {
        try {
            if (arr[index] == Integer.MAX_VALUE) {
                arr[index] = element;
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("It is already filled");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid access");
        }
    }

    // Array Traversal
    // Time Complexity O(n)
    public void traverseArray() {
        try {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    // search for an element in a given array
    public void searchArray(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value is Found at index of " + i);
                return;
            }
        }
        System.out.println(value + " is not found");
    }

    // Delete element from array
    // O(1)
    public void deleteElement(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Deleted Successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that provided is not in the range");
        }
    }

    public static void main(String[] args) {
        singledimensionArray sda = new singledimensionArray(10);
        sda.insert(0, 3);
        sda.insert(1, 2);
        sda.insert(2, 3);
        // sda.insert(1, 5);
        // sda.insert(12, 120);
        // System.out.println("Array Traversal");
        // i.traverseArray();

        // sda.searchArray(2);
        sda.deleteElement(2);
        System.out.println(sda.arr[2]);
    }

}