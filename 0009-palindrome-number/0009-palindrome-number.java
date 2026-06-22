import java.util.Scanner;
class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        return false;
        int rev=0;
        for(int i = x ; i > 0; i=i/10)
        {
            int temp = i%10;
            rev=rev*10+temp;
        }
        return (x==rev);
    }

    public static void main( String ar[])
    {
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter a number");
        int xx=sc.nextInt();
        Solution ob=new Solution();
        boolean result = ob.isPalindrome(xx);
        System.out.println(result);
    }
}