class Solution {
    public int totalMoney(int n) {
        int res=0;
        if(n<=7)
            return n*(n+1)/2;
        else{
            int q=n/7;
            int r=n%7;
            for(int i=0;i<q;i++)
            res += 28 + (i * 7); 
            res += r * (q + 1) + (r - 1) * r / 2;
        }  
        return res;  
    }
}