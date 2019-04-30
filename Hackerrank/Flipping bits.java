import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flippingBits function below.
    static long flippingBits(long n) {
         String st="";
        while(n!=0)
        {
            long t=n%2;
            st=t+st;
            n/=2;
        }
        String store="00000000000000000000000000000000";
        String empty=store.substring(0,store.length()-st.length())+st;
            String str="";
            for(int i=0;i<empty.length();i++)
            {
                if(empty.charAt(i)=='1')
                {
                    str=str+'0';
                }
                else
                {
                    str=str+'1';
                }
            }
            long binary=1;
            long sum=0;
            for(int i=str.length()-1;i>=0;i--)
            {
                sum=sum+(binary*(str.charAt(i)-'0'));
                binary=binary*2;
            }
            return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
