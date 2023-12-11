class printpairs {
    public static void main(String[] args) {
        printpairs p = new printpairs();
        int[] a = { 1, 3, 4, 5 };
        p.printPairs(a);
        p.unorderedPairs(a);
    }

    void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }

    void unorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
}