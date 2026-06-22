import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }
        return result;
    }



    public static void main( String args[])
    {
        Solution ob = new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of the first array");
        int a = sc.nextInt();
        int aa[] = new int[a];
        System.out.println("enter elements of the first array");
        for(int i = 0;i < a;i++)
        aa[a]=sc.nextInt();
        System.out.println("enter length of the second array");
        int b = sc.nextInt();
        int bb[] = new int[b];
        System.out.println("enter elements of the second array");
        for(int i = 0;i < b;i++)
        bb[b]=sc.nextInt();
        int cc[]=new int[(a<=b ? a:b)];
        cc=ob.intersect(aa,bb);
        System.out.println("interection of two arrays : ");
         for ( int j =0 ; j< cc.length; j++)
        {
           System.out.println(cc[j]);
    }
}
}