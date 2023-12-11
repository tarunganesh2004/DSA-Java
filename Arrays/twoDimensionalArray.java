import java.util.Arrays;

public class twoDimensionalArray {
    int arr[][] = null;

    public twoDimensionalArray(int rows, int columns) {
        arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting
    public void insertValue(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Value is inserted");
            } else {
                System.out.println("cell is already created");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    // Accessing cell values from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing row#" + row + "col#" + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    // Traversing 2D Array
    public void traverse() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // searching for an element
    public void searchValue(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at row: " + row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    // delete element
    public void deleteElement(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");
        }
    }

    public static void main(String[] args) {
        twoDimensionalArray tda = new twoDimensionalArray(3, 3);
        tda.insertValue(0, 0, 10);
        tda.insertValue(0, 1, 19);
        tda.insertValue(1, 0, 100);
        tda.insertValue(2, 0, 20);
        // tda.traverse();
        // tda.accessCell(0, 1);
        System.out.println(Arrays.deepToString(tda.arr));
        // tda.searchValue(20);
        tda.deleteElement(2, 0);
        System.out.println(Arrays.deepToString(tda.arr));

    }
}
