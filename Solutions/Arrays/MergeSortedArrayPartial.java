package Arrays;

import java.util.Arrays;

public class MergeSortedArrayPartial {
    
    public static void mergeSorted(int nums1[], int nums2[], int m, int n) {
        int j= 0;
     for(int i=m; i<= (m+n)-1; i++) {
         nums1[i] = nums2[j];
         j++;
     }
     int x=0,y=m;
     while(x < y && y<m+n) {
         if(nums1[x] < nums1[y]) {
             x++;
         } else if(nums1[x] > nums1[y]) {
             int temp = nums1[x];
             nums1[x] = nums1[y];
             nums1[y] = temp;
             x++;
             y++;
         } else {
             int temp = nums1[x+1];
             nums1[x+1] = nums1[y];
             nums1[y] = temp;
             x++;
         }
     }
     
    }
    
    public static void main(String args[]) {
        int nums1[] = {1,2,4,5,6,0};
        int nums2[] = {3};
        MergeSortedArrayPartial.mergeSorted(nums1, nums2, nums1.length - nums2.length, nums2.length );
        System.out.println(Arrays.toString(nums1));
    }
}
