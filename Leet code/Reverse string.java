class Solution {
    public void reverseString(char[] s) {
        revString(0,s.length-1,s);
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
        
    }
    static void revString(int l,int r,char[] s)
    {
        if(l>=r)
        {
            return;
        }
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        revString(l+1,r-1,s);
    }
}
