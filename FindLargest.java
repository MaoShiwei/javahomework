import java.util.Scanner;
public class FindLargest {
    public static int indexOfLargestElement(double[] array){
        int max = 0;
        for (int i = 0; i < 10; i++){
            if (array[max] < array[i]) {
                max = i;
            }
        }
        System.out.print("The index is " + max + "\n");
        System.out.print("The largest element is " + array[max]);
        return max;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Please enter the 10 numbers: \n");
        for (int j = 0; j < 10; j++) {
            double num = input.nextDouble();
            array[j] = num;
        }
        indexOfLargestElement(array);
    }
}
