package Plus_Minus;

import java.util.Scanner;

public class PlusMinusProgram {

    static void plusMinus(int[] arr,int size) {
        float posNumber=0,negNumber=0,zeroNumber=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i] < 0) {
                negNumber++;
            }
            if(arr[i]>0) {
                posNumber++;
            }
            if(arr[i]==0) {
                zeroNumber++;
            }
        }
        System.out.println(posNumber/size);
        System.out.println(negNumber/size);
        System.out.println(zeroNumber/size);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr,n);

        scanner.close();
    }
	
}
