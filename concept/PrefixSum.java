import java.util.Arrays;

public class  PrefixSum {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};

        // Build prefix sum
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println(Arrays.toString(prefix));

        // Find sum from index 1 to 3
        int l = 1;
        int r = 3;

        int sum;

        if(l == 0) {
            sum = prefix[r];
        } else {
            sum = prefix[r] - prefix[l - 1];
        }

        System.out.println("Range Sum: " + sum);
    }
}