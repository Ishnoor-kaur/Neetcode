class Solution {
        public static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = indexOf(nums, target);
        int lastOccurrence = lastIndexOf(nums, target);
        
        if (firstOccurrence == -1 || lastOccurrence == -1) {
            return new int[]{-1, -1};
        } else {
            return new int[]{firstOccurrence, lastOccurrence};
        }
    }
    
    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found the target at index i
            }
        }
        return -1; // Target not found
    }
    
    public static int lastIndexOf(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i; // Found the target at index i
            }
        }
        return -1; // Target not found
    }
}