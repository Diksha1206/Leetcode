public class BinarySearchRecursive {



    public static boolean findNumber(int array[], int left, int right, int searchElement) {
        int result = 0;
        if(left>right) {
            return false;
        }

        int mid = (left + right)/2;
        if(array[mid]== searchElement) {
            return true;
        } else if(searchElement < array[mid]) {
            return findNumber(array, left, mid-1, searchElement);
        } else {
            return findNumber(array, mid+1, right, searchElement);        
        }                    
    }
    

    public static void main(String[] args) {
        int array[] = {1,3,5,7,9,11};
        boolean result = findNumber(array, 0, array.length-1, 11);
        System.out.println(result);
    }
}
