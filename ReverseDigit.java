import java.util.Scanner;
public class ReverseDigit {
    public static int reverse(int number) {
        String s = String.valueOf(number);
        String r;
        r = new StringBuilder(s).reverse().toString();
        int n = Integer.parseInt(r);
        return n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int value = input.nextInt();
        int out = reverse(value);
        System.out.println("The reversed number is " + out);
    }
}
