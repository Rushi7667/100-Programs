// WAP to check weather number is present in array or not (using recursion only) and the function’s syntax is given below
// Int isInArray(int a[],int m);
// Where int a[] is Array of integer and m is element to be searched.

public class prog_25 {

    // Recursive function to check if m is present in the array a
    public void isInArray(int[] a, int m, int n) {
        if (n == 0) {
            System.out.print("not found"); // Base case: Element not found in the array
        } else if (a[n - 1] == m) {
            System.out.print("found"); // Base case: Element found in the array
        } else {
            isInArray(a, m, n - 1); // Recursive case: Check in the remaining elements of the array
        }
    }

    // Wrapper function to call the recursive function with the size of the array
    public void isInArray(int[] a, int m) {
        int n = a.length;
        isInArray(a, m, n);
    }

    // Main method to test the isInArray function
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int m = 1;

        prog_25 k = new prog_25();
        k.isInArray(a, m);
    }
}

