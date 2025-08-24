class Solution 
{
    public int gcdOfOddEvenSums(int n) 
    {
        /**
        method -------1 
        int sumOdd=0;
        int sumEven=0;
        int gcd=1;

//method -----3
         int sumOdd = n * n;
        int sumEven = n * (n + 1); 


        for (int i = 1; i <= 2*n; i += 2) {
            sumOdd += i;
        }

        for (int i = 2; i <= 2*n; i += 2) 
            sumEven += i;

            for(int k=1;k<=Math.min(sumOdd, sumEven);k++){
                if(sumOdd%k ==0 && sumEven%k==0)
                gcd=k;
            }
            return gcd; */


/** 
            // method-------2
             int sumOdd = n^2;
            int sumEven = n*(n+1);
            //GCD of n^2 and n*(n+1) = n because n and n+1 are coprime
            //GCD(n^2, n*(n+1)) = n * GCD(n, n+1)
           //n and n+1 are consecutive numbers, so GCD(n, n+1) = 1
           // GCD(sumOdd,sumEven)=n∗1=n
             return n;
*/


// method----4
// EUCLID ALGO
            int a = n * n; //odd terms
        int b = n * (n + 1); //even terms 

        while(a>0&& b>0)
        {
          if(a>b)
          a=a%b;
          else
          b=b%a; 
          
        }
        if(a==0)
          return b;
return a;

/** 
//recursion
//method---5

 int a = n * n; //odd terms
int b = n * (n + 1); //even terms 

int gcd(int a,int b)
{
    if(b==0)
    return a;
    return gcd(b,a%b);
   

}
 */
    }
}
   