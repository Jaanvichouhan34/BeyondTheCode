import java.util.Arrays;

class two_pointer_remove_duplicate {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3};

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[fast] != nums[slow]) {

                slow++;
                nums[slow] = nums[fast];
            }
        }

        // Number of unique elements
        int k = slow + 1;

        System.out.println("Unique elements: " + k);

        // Print only the useful part of the array
        System.out.println(
            Arrays.toString(Arrays.copyOf(nums, k))
        );
    }
}