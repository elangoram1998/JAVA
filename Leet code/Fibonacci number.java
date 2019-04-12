class Solution {
    static HashMap<Integer,Integer>hm=new HashMap<>();
    public int fib(int N) {
        int res;
        if(hm.containsKey(N))
        {
            return hm.get(N);
        }
        if(N<2)
        {
            res=N;
        }
        else
        {
        res=fib(N-1)+fib(N-2);
        }
        hm.put(N,res);
        
        return res;
    }
}
