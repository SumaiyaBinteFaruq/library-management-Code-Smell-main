package library.management.system;

/**
 * DEAD CODE - Code Smell Refactoring
 * 
 * This class was identified as Dead Code because:
 * - linearSearch() and binarySearch() are never called anywhere in the project
 * - No other class imports or uses this class
 * 
 * Kept for reference but marked as dead.
 * To remove completely, delete this file.
 * To reactivate, uncomment and add usage.
 */
 
/*
public class Search {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) return mid;
            if (array[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
*/