package counting_valleys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
    public static int countingValleys(int steps, String path) {
        int uCount=0,valley=0;
        for(int i=0;i<path.length();i++) {
            if(path.charAt(i)=='U') {
                uCount+=1;
            }
            if(path.charAt(i)=='D') {
                uCount-=1;
            }
            if(path.charAt(i)=='U' && uCount==0) {
                valley+=1;
            }
        }
        return valley;
    }
}

public class CountingValleysProgram {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}
