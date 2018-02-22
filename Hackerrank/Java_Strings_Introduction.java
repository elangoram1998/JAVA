import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int a=A.compareTo(B);
        if(a>0)
        {
            System.out.println("Yes");
        }
        else if(a<0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Equal");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        
    }
}
