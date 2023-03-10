public class DuplicateWordFinder {
    public static boolean Duplicates(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    return true;
                }
            }
        }
        return false;
    }
    // checks for duplicates
    public static void main(String[] args) {
        String[] strings = {"spring","summer","fall","winter", "winter"};
        int n = strings.length;
        for (int i = 0; i < n; i++) {
            System.out.println(strings[i] + "");
            //reprints the strings
        }
        System.out.println();
        System.out.println("Is there any duplicates?: " + Duplicates(strings));
    }
}
/*Test cases:
With duplicate value: Output = true
With one value: Output = false
With no values: Output = false
 */
