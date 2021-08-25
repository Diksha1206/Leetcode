public class RemoveElementNON {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != val)
                nums[j++] = nums[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int array[] = {0,1,2,2,3,0,4,2};
        int finalResult = removeElement(array, 2);
        for(int i=0;i<finalResult;i++) {
            System.out.println(array[i]);
        }
    }
}
