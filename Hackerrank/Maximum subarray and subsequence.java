import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maxSubarray function below.
    static int[] maxSubarray(int[] arr) {
        int[] res=new int[2];
        int temp=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            temp=temp+arr[i];
            max=Math.max(temp,max);
            if(temp<0)
            {
                temp=0;
            }
        }
        res[0]=max;
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        if(arr[n-1]<=0)
        {
            res[1]=arr[n-1];
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]>0)
                {
                    sum=sum+arr[i];
                }
            }
            res[1]=sum;
        }
        /*int n=(int)Math.pow(2,arr.length);
        max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<arr.length;j++)
            {
                if(BigInteger.valueOf(i).testBit(j))
                {
                    sum=sum+arr[j];
                }
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        res[1]=max;*/
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = maxSubarray(arr);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
