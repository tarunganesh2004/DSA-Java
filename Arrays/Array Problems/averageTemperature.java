import java.util.Scanner;

class averageTemperature {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("How many days temperatures: ");
        int n = c.nextInt();
        int temps[] = new int[n];
        // record temperature and find average
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + " 's high temp");
            temps[i] = c.nextInt();
            sum += temps[i];
        }

        double average = sum / n;
        // count days above averagee
        int above = 0;
        for (int i = 0; i < n; i++) {
            if (temps[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp: " + average);
        System.out.println("Days above average temperature: " + above);
        c.close();
    }
}
