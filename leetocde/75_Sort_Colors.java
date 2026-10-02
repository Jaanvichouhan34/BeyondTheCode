package leetocde;

//Dutch National Flag
class Solution {
    public void sortColors(int[] nums) {
//i=low and j=mid and k=high
        int i = 0;                  // Position for 0
        int j = 0;                  // Current element
        int k = nums.length - 1;    // Position for 2

        while (j <= k) {

            if (nums[j] == 0) {
                // Put 0 at the left
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;
            }

            else if (nums[j] == 1) {
                // 1 is already in the middle
                j++;
            }

            else {  // nums[j] == 2
                // Put 2 at the right
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;

                k--;
                // Don't increase j!
            }
        }
    }
}
