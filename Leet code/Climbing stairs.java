class Solution {
    static HashMap<Integer,Integer>hm=new HashMap<>();
    public int climbStairs(int n) {
        if(hm.containsKey(n))
        {
            return hm.get(n);
        }
        int res;
        if(n<2)
        {
            return 1;
        }
        res=climbStairs(n-1)+climbStairs(n-2);
        hm.put(n,res);
        return res;
    }
}
