import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int pos = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == key) {
                pos = mid;
                break;
            } 
            else if (a[mid] < key) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + (pos + 1));
        }
        sc.close();
    }
}