package leetocde;

class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;  // Last unique element

        for (int j = 1; j < nums.length; j++) {

            // Found a new unique element
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // Number of unique elements
        return i + 1;
    }
}
