public class RotatedSorted {

    // Main function to search target
    public static int Sorted(int nums[], int target) {
        int min = minSearch(nums); // find pivot

        // decide which half to search
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, min, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, min - 1, target);
        }
    }

    // Find the index of minimum element (pivot)
    public static int minSearch(int nums[]) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low; // index of smallest element
    }

    // Standard binary search
    public static int binarySearch(int nums[], int start, int end, int target) {
        int low = start, high = end;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println(Sorted(nums1, target1)); // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(Sorted(nums2, target2)); // Output: -1
    }
}


