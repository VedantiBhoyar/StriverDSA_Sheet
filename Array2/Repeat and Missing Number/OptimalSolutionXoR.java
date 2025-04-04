public class Solution {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int xor = 0, n = a.length;

        // XOR all array elements and numbers from 1 to n
        for (int i = 0; i < n; i++) {
            xor ^= a[i];
            xor ^= (i + 1);
        }

        // Find the rightmost set bit (differentiating bit)
        int diffBit = xor & ~(xor-1);

        int bucket1 = 0, bucket2 = 0;

        // Divide elements into two buckets and XOR separately
        for (int i = 0; i < n; i++) {
            if ((a[i] & diffBit) != 0)
                bucket1 ^= a[i];
            else
                bucket2 ^= a[i];

            if (((i + 1) & diffBit) != 0)
                bucket1 ^= (i + 1);
            else
                bucket2 ^= (i + 1);
        }

        // Determine which is the repeating number
        for (int i = 0; i < n; i++) {
            if (a[i] == bucket1) {
                return new int[]{bucket1, bucket2}; // repeating, missing
            }
        }
        return new int[]{bucket2, bucket1}; // repeating, missing
    }
}
