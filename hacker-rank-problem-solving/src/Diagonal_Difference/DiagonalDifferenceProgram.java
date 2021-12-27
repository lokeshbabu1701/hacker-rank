package Diagonal_Difference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr,int size) {
        int absCount=0,firstSize=0,secondSize=0;
        for(int fPtr=0;fPtr<size;fPtr++)
        {
            for(int sPtr=0;sPtr<size;sPtr++)
            {
                if(fPtr==sPtr)
                {
                    firstSize = firstSize + arr.get(fPtr).get(sPtr);
                }
                if(fPtr==size-sPtr-1)
                {
                    secondSize = secondSize + arr.get(fPtr).get(sPtr);
                }
            }
        }
        absCount = Math.abs(firstSize-secondSize);
        return absCount;
    }
}

public class DiagonalDifferenceProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr,n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
