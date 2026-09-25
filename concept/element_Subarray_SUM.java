import java.util.*;

public class SubarraySumFinder {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1};
        int k = 5;

        int prefix = 0;

        // prefix sum -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        // prefix sum 0 exists before the array starts
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            prefix += nums[i];

            int required = prefix - k;

            if (map.containsKey(required)) {

                int previousIndex = map.get(required);

                int start = previousIndex + 1;
                int end = i;

                System.out.print("Subarray: [");

                for (int x = start; x <= end; x++) {
                    System.out.print(nums[x]);

                    if (x < end) {
                        System.out.print(", ");
                    }
                }

                System.out.println("]");
            }

            // Store current prefix and its index
            map.put(prefix, i);
        }
    }
}