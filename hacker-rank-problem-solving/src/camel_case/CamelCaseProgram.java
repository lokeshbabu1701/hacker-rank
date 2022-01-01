package camel_case;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
    public static int camelcase(String s) {
        int count = 0;
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++) {
            int ascii = charArray[i];
            if(ascii < 97) {
                count++;
            }
            ascii = 0;
        }
        return count+1;
    }
}

public class CamelCaseProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
