import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>alist=new ArrayList<ArrayList<Integer>>();
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> list=new ArrayList<>();
                int d=sc.nextInt();
                for(int j=0;j<d;j++)
                {
                list.add(sc.nextInt());
                }
                alist.add(list);
            }
        int q=sc.nextInt();
        while(q-- >0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            try
            {
            System.out.println(alist.get(x-1).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}

