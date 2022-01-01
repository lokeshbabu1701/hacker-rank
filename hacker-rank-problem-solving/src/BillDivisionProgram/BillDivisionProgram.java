package BillDivisionProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalSum = bill.stream().mapToInt(i -> i.intValue()).sum();
        int common = (totalSum-bill.get(k))/2;
        if((Math.abs(common-b)) > 0) {
            System.out.println((Math.abs(common-b)));
        } else {
            System.out.println("Bon Appetit");
        }
    }
}

public class BillDivisionProgram {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
	
}
