import java.util.Scanner;

public class Ant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();

        // Read the array elements
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Calculate number of times the ant returns to starting position
        int count = 0;
        int position = 0;

        for (int i = 0; i < n; i++) {
            position += A[i];
            if (position == 0) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
    }
}
