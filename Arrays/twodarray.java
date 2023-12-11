import java.util.Arrays;

public class twodarray {
    // static int a[][] = new int[2][3];

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(a));

        // step-1 - Declare
        int[][] int2DArray;
        // step-2 Instantiate
        int2DArray = new int[2][2]; // O(mn) Time Complexity (m-no of rows,n-no.of columns)
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        // System.out.println(Arrays.deepToString(int2DArray));

        String s[][] = { { "a", "b" }, { "c", "d" } };
        System.out.println(Arrays.deepToString(s));

    }
}
