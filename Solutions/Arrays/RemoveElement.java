package Arrays;

import java.util.Arrays;

public class RemoveElement {

    
    public static int removeElements(int array[]) {
        int num = 2; int count = 0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int i=0; i<array.length; i++) {

            if(array[i] == num) {
                count++;
            }

            if(array[i] > num) {
                array[i-count] = array[i];
            }
        }

        return  (array.length)-count;
    }

    public static void main(String[] args) {
        int array[] = {0,1,2,2,3,0,4,2};
        int finalResult = removeElements(array);
        for(int i=0;i<finalResult;i++) {
            System.out.println(array[i]);
        }
    }
}
