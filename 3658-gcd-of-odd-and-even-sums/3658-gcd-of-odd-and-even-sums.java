class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0)
            sumEven+=i;
            else
            sumOdd+=i;
        }
        int gcd=sumEven<sumOdd?sumEven:sumOdd;
        while(gcd>1){
            if(sumEven%gcd==0 && sumOdd%gcd==0)
            return gcd;
            else
            gcd--;
        }
        return 1;
    }
}