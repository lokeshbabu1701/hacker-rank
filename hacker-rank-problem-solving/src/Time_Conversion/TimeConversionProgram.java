package Time_Conversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversionProgram {

    static String timeConversion(String s) {
        String[] time = s.split(":");
        String hour = time[0];
        String minute = time[1];
        String second = time[2].substring(0, 2);
        String temp = time[2].substring(2, 4);
        if(temp.equals("AM") && hour.equals("12")) 
        {
            hour="00";
        } 
        if(temp.equals("PM"))
        {
            if(!(hour.equals("12"))) {
                int h=Integer.parseInt(hour);
                h=h+12;
                hour=""+h;
            }
        }
        return hour+":"+minute+":"+second;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
	
}
