class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        while(temp!=1 && temp != 4){
           int m=temp;
           int sum = 0;
            while(m!=0){
            int d=m%10;
            sum+=d*d;
            m=m/10;
            }
           temp=sum;
        }
        return temp==1;
    }
}