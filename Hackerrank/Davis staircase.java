import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        static HashMap<Integer,Integer>hm=new HashMap<>();
    // Complete the stepPerms function below.
    static int stepPerms(int n) {
            int[] array={1,2,3};
            return countSteps(array,n);
    }
    static int countSteps(int[] array,int n)
    {
        if(n==0)
            {
                return 1;
            }
            if(n<0)
            {
                return 0;
            }
            if(hm.containsKey(n))
            {
                return hm.get(n);
            }
            int res=0;
            for(int i=0;i<array.length;i++)
            {
                res=res+countSteps(array,n-array[i]);
                hm.put(n,res);
            }
            return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
