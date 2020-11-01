import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = 0; j < list.size() -i -1; j++){
                int num1 = list.get(j).intValue();
                int num2 = list.get(j+1).intValue();
                if (num1 > num2 ){
                    list.set(j,num2);
                    list.set(j+1, num1);
                }
            }
        }
    }

    public static void print(ArrayList<Number> list){
        System.out.println("排序后的结果为：");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i).intValue() + " ");
        }
    }

    public static void main(String[] args){
        ArrayList<Number> list1 = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.print("输入数列长度: ");
        int n = input.nextInt();
        System.out.print("输入数列: ");
        for (int i = 0; i < n; i++){
            list1.add(input.nextInt());
        }
        sort(list1);
        print(list1);
    }
}
