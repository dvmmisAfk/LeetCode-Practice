class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        String num="";
        for(int i = n ; i > 0 ; i=i/10){
            int digit = i%10;
            if(digit!=0){
                num=String.valueOf(digit)+String.valueOf(num);
            }
            sum+=digit;
        }
        if(num=="")
        return 0;
        int ans=Integer.parseInt(num);
        return (long)sum*ans;
    }
}