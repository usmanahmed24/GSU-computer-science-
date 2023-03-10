public class twoSum {
    public static void main(String[] args) {
    twosum(new int[] {2,6,7,8}, 10);
    }
    static void twosum(int[] a, int targetNumber) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == targetNumber) {
                    System.out.println("Solution: " + "(" + a[i] + "," + a[j] + ")");
                }
            }
        }
    }
}