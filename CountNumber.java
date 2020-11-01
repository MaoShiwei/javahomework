import java.util.Scanner;
public class CountNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入共有几个随机数: ");
        int m = input.nextInt();
        int n;
        int[] RandomList = new int[200];
        int[] CountList = new int[10];
        for (int i = 0; i < m; i++) {
            RandomList[i] = (int)(Math.random() *10);
            System.out.print(RandomList[i]+" ");
            n = RandomList[i];
            CountList[n] = CountList[n] + 1;
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print("随机数据中共有 "+CountList[j]+" 个 "+j+"\n");
        }
    }
}
