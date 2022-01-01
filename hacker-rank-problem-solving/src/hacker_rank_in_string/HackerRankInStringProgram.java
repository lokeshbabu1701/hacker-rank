package hacker_rank_in_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result {
    public static String hackerrankInString(String s) {
        int count = 0;
        String resultCheck = "hackerrank";
        for(int i=0;i<s.length() && count<resultCheck.length();i++) {
            if(s.charAt(i) == resultCheck.charAt(count)) {
                count++;
            }
        }
        if(count == resultCheck.length()) {
            return "YES";
        }
        return "NO";

    }
}
public class HackerRankInStringProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
