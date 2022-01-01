package extra_long_factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Result {
    public static void extraLongFactorials(int n) {
        BigInteger bi = new BigInteger("1");
        for(int i=2;i<=n;i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);
        
    }
}
public class ExtraLongFactorialProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
