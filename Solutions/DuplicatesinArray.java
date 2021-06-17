public class DuplicatesinArray {


    public static int removeDuplicates(int nums[]) {
        int resultantCount = 0, i = 0, j = i+1;

        while(j<nums.length) {

            if(nums[i] == nums [j]) {
                j++;
            } else {
                nums[i+1] = nums[j];
                i++; j++; 
                resultantCount++;
            }
        }   
        return resultantCount;
    }

    public static void main(String[] args) {
        int nums [] = {1,1,1,1,2,2,3,4};    
        int length = removeDuplicates(nums);
        for(int count = 0; count <= length; count++) {
            System.out.println(nums[count]);
        }
    }
}
