import java.util.*;
public class ReverseArray {
    public static void reverseArray(int array[]) {
        int mid = (array.length)/2;
        int last = array.length;
        for(int i = 0; i < mid;i++) {
            last--;
            int temp = array[i];
            array[i] = array[last];
            array[last] = temp;
        }
    }
    //reverses the array
    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
    }
    //prints the array
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int elements = read.nextInt();
        if(elements <= 0) {
            System.out.println("Please enter number greater than 0: ");
            elements = read.nextInt();
        }
        //makes sure array length is more than 0
        int[] array = new int[elements];
        System.out.println("Enter number in the array: ");
        for (int i = 0; i < elements; i++) {
            array[i] = read.nextInt();
        }
        reverseArray(array);
        System.out.println("Reversed array:");
        printArray(array);
    }
}
/* Test cases:
one element in array: returns element
no element in array: returns nothing
array filled with the same number: returns the input
array with one or more duplicates: puts the duplicate numbers in the right spot
 */
