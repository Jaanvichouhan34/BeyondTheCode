package leetocde;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
//all three numbers are positive → their sum cannot be 0.
            // If smallest number > 0, sum can't be 0
            if (nums[i] > 0) break;

            // Skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {

                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    l++;
                    r--;

                    // Skip duplicate left/right values
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;

                } 
                else if (sum < 0) {
                    l++;       // Need a bigger sum
                } 
                else {
                    r--;       // Need a smaller sum
                }
            }
        }

        return list;
    }
}