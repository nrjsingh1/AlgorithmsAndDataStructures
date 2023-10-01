package Searching;

public class BinarySearchRunner {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int nums[] = {1,3,5,6,8};
        int target = 4;

        System.out.println("Result = " + binarySearch.findNumberPositionInSortedArray(nums, target));

    }
}
