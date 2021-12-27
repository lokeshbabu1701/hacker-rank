package Mini_Max_Sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSumProgram {

    static void miniMaxSum(Long[] arr) {
        Long sum=0l;
        List<Long> list = arrayToList(arr);
        Collections.sort(list);
        sum = list.stream().reduce(0l, (num1,num2) -> num1 + num2);
        Long min = list.stream().min(Comparator.comparing(Long::valueOf)).get();
        Long max = list.stream().max(Comparator.comparing(Long::valueOf)).get();
        System.out.println((sum-max)+" "+(sum-min));
    }
    static List<Long> arrayToList(Long arr[]) {
        List<Long> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        return list;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Long[] arr = new Long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            Long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
	
}
