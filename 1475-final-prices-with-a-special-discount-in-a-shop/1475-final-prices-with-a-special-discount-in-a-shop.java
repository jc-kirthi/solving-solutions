class Solution {
    public int[] finalPrices(int[] prices) {
        int res[]=new int[prices.length];
       
        for(int i=0;i<prices.length;i++){
             boolean flag=false;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i])
                {
                    res[i]=prices[i]-prices[j];
                    flag=true;
                    break;
                }
            }
            System.out.println(prices[i]);
            if(!flag)
            res[i]=prices[i];
        }
        return res;
    }
}