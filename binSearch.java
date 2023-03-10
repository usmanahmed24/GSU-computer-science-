public class binSearch {
    public static int[]check (int ARRAY1[], int ARRAY2[], int n, int m) {
        int res[] = new int[n];
        int position = 0;
        for (int i = 0; i < n; i++) { //iterates through ARRAY1
            if (i == 0 || ARRAY1[i] != ARRAY1[i - 1]) {
                if (BinarySearch(ARRAY2, 0, m - 1, ARRAY1[i])) { //Searches for any of the elements of ARRAY1 in ARRAY2
                    res[position] = ARRAY1[i];
                    position++;
                }
            }
        }
        int[] fin = new int[position]; //puts values in new array
        for (int i = 0; i < position; i++) {
            fin[i] = res[i];
        }
        return fin;
    }
    public static boolean BinarySearch(int arr[], int n, int m, int key){
        while (n <= m){
            int mid = (n+m)/2;  //binary search
            if(arr[mid]==key){
                return true;
            }
            else if (arr[mid] > key) {
                m=mid-1;
            }
            else{
                n = mid+1;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        int ARRAY1[] = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
        int ARRAY2[] = {6, 6, 9, 11, 21, 21, 21};
        int n = ARRAY1.length;
        int m = ARRAY2.length;
        int []fin = check(ARRAY1,ARRAY2,n,m);
        System.out.print("ARRAY[]="); // Prints the new array
        System.out.print("[");
        for(int i=0; i<fin.length; i++){
            if(i>0) {
                System.out.print(",");
            }
            System.out.print(fin[i]);
        }
        System.out.print("]");
    }
}
/* Test case for one empty array: output: ARRAY=[]*/
/* Test case for both empty arrays: output: ARRAY=[]*/
/*
 */