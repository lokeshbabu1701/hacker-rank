package day_of_the_programmer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class dayOfProgrammerProgram {

    static String dayOfProgrammer(int year) {
        if(year>=1700 && year<=1917) {
            if(year%4==0) {
                return "12.09."+year;
            } else {
                return "13.09."+year;
            }
        }
        if(year>1918 && year<=2700) {
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
                return "12.09."+year;
            } else {
                return "13.09."+year;
            }
        }
        if(year==1918) {
            return "26.09."+year;
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}
