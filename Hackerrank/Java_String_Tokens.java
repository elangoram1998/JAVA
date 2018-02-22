import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] array=s.split("[ !,?._'@]+");
        System.out.println(array.length);
        for(String w:array)
        {
        	System.out.println(w);
        }
        scan.close();
    }
}
