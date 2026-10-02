
import java.util.*;
 class Movezeroestoend {
    public static void main(String[] args) {

        int[] nums = {1, 0, 2, 0, 3, 0, 4, 2, 0};

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] != 0) {

                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
