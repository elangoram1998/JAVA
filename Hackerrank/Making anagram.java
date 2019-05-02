import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] array1=new int[26];
        int[] array2=new int[26];
        for(int i=0;i<a.length();i++)
        {
            array1[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            array2[b.charAt(i)-'a']++;
        }
        int temp=0;
        for(int i=0;i<26;i++)
        {
            temp=temp+Math.abs(array1[i]-array2[i]);
        }
        return temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
