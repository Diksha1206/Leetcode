public class DuplicatesInArraySize2 {
    

    public static int removeDuplicates(int nums[]) {

        int s = 2, f=2;
        if(nums.length <3) {
            return nums.length;
        }

      
            while(f<nums.length){      
            if(nums[f] != nums[s-2]) {
                nums[s] = nums[f];
                s++;
            }
            f++;
        }
        return s;
    }

    public static void main(String[] args) {

        int nums[] = {0,0,0,0,1,1,1,1,2,2,2,3,3,4};
        int result = removeDuplicates(nums);
        for(int i=0; i<result; i++) {
            System.out.println(nums[i]);
        }        
    }
}
