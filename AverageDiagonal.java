import java.util.Scanner;
public class AverageDiagonal {
    public static double averageMajorDiagonal(double[][] m){
        double sum = 0;
        double average = 0;
        for (int i = 0; i < 4; i++){
            sum = sum + m[i][i];
        }
        average = sum/4;
        return average;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4];
        System.out.print("Enter a 4-by-4 matrix row by row: \n");
        for (int p = 0; p < 4; p++){
            for (int q = 0; q < 4; q++){
                matrix[p][q] = input.nextDouble();
            }
        }
        System.out.print("Average of the elements in the major diagonal is " + averageMajorDiagonal(matrix));
    }
}
