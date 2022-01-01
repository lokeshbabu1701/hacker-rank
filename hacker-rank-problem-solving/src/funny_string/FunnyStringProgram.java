package funny_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Result {
    public static String funnyString(String s) {
        int flag = 0;
        List<Integer> mainList = new ArrayList<Integer>();
        List<Integer> reverseList = new ArrayList<Integer>();
        String reverse  = new StringBuffer(s).reverse().toString();
        for(int i=0;i<s.length();i++) {
            mainList.add((int) s.charAt(i));
            reverseList.add((int) reverse.charAt(i));
        }
        for(int i=0;i<mainList.size()-1;i++) {
            int firstMain = mainList.get(i);
            int secondMain = mainList.get(i+1);
            int firstreverse = reverseList.get(i);
            int secondreverse = reverseList.get(i+1);
            if(!((Math.abs(firstMain-secondMain))==(Math.abs(firstreverse-secondreverse)))) {
                flag = 1;
                return "Not Funny";
            } 
        }
        return "Funny";
    }
}
public class FunnyStringProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.funnyString(s);

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
