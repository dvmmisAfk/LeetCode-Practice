class Solution {
    public int differenceOfSums(int n, int m) {
     int sum_not_m = 0 , sum_m = 0 ;
     for ( int i = 1 ; i <= n;i++)
     {
        if ( i%m == 0 )
        sum_m += i;
        else 
        sum_not_m += i;
     }   
     return ( sum_not_m-sum_m);
    }
}