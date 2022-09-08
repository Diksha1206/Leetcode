package Arrays.StringArrays;

import java.util.Arrays;

public class MergeSortedArray {
    
    public static int[] solution(int nums1[], int nums2[], int m, int n) {
        int i=m-1, j=n-1, index = m+n-1;
        while(i >=0 && j>=0) {
            if(nums1[i] >= nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            }  else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
        while(i>=0) {
            nums1[index--] = nums1[i--];
        }
        while(j>=0) {
            nums1[index--] = nums2[j--];
        }
        return nums1;
    }
    
    public static void main(String args[]) {
        int nums1[] = {0};
        int nums2[] = {1};
        int n = nums2.length;
        int m = nums1.length - n;
        int result[] = MergeSortedArray.solution(nums1, nums2, m, n);
        System.out.println("The result is" + Arrays.toString(result));
    }
}
