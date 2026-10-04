class Solution {
    public int countCommas(int n) {
        int c=0;
        
        if(n<=999)
        return 0;
        else{
        for(int i=1000;i<=n;i++){
            c++;
        }
    }
    return c;
    }
}