package stair_case;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
    public static void staircase(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}

public class StaircaseProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
