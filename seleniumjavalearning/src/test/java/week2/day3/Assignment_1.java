package week2.day3;

public class Assignment_1 {

    // This method checks if there are two equal elements in the array
    // with indices difference at most k.
    public static boolean containsNearbyDuplicate(int[] nums, int k) {  //nums is  array of integer & k is integer
        
    	 // Loop through each index i from the start of the array
        for (int i = 0; i < nums.length; i++) {
        
        // Loop through each index j after i
        for (int j = i + 1; j < nums.length; j++) {
        
        // Check if nums[i] is equal to nums[j] and the difference between i and j is at most k
        if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
        
        // If the conditions are met, we found two indices with equal elements within the range k
        return true;
        }
        }
        }
        // If no such indices are found, return false
        return false;
        }

        public static void main(String[] args) {
        
        // Example usage
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(containsNearbyDuplicate(nums1, k1)); // Output: true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(containsNearbyDuplicate(nums2, k2)); // Output: true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums3, k3)); // Output: false
    }
}
