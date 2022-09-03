package BinarySeacrh;

public class BinarySearch {
    public static int binary(int start, int end, int [] array, int numberToFind) {
        if (end >= start) {
            int middle = (start + end) / 2;
            if (array[middle] == numberToFind) {
                return middle;
            }
            if (numberToFind < array[middle]) {
                return binary(array[0], middle - 1, array, numberToFind);
            } else {
                return binary(middle + 1, array.length - 1, array, numberToFind);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int sortedArray[] = {0,2,4,6,8,10,12,14};
        int numberToFind = 0;
        int resultPosition = binary(0, sortedArray.length-1, sortedArray, numberToFind);
        System.out.println(resultPosition);
    }
}
