import java.util.Scanner;
public class RandomMatrix {
    public static void printMatrix(int n) {
        int[][] matrix = new int[n][n];
        double m;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                m = Math.random();
                matrix[i][j] = (int)(Math.round(m));
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int value = input.nextInt();
        printMatrix(value);
    }
}
