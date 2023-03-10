import java.util.*;
public class hashTwoSum {
    // time complexity O(n) | space complexity O(n)
    public static void main(String[] args) {
        twoSum(new int[]{2,6, 7, 8}, 10);
    }

    public static void twoSum(int[] numbers, int targetSum) {
        int[] result = null;
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            int diff = targetSum - numbers[i];
            if (map.contains(diff)) {
                result = new int[2];
                result[0] = numbers[i];
                result[1] = diff;
                break;
            }
            map.add(numbers[i]);
        }
        System.out.println("(" + result[0] + "," + result[1] + ")");

    }
}