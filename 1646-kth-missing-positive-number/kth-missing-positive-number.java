class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);
            
            if (missing < k) {
                left = mid + 1; // Look in the right half
            } else {
                right = mid - 1; // Look in the left half
            }
        }
        
        // The kth missing number will be left + k
        return left + k;
    }
}
