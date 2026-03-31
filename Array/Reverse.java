package Array;

import java.util.Scanner;

public class Reverse {
    public static void reverse(int arr[], int n) {
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente the size of the Array: ");

        int size = sc.nextInt();

        System.out.println("Enter the element of the array: ");

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before reverse is: ");

        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.println();
        System.out.print("Array after reverse is: ");
        reverse(arr, size);
        sc.close();
    }
}
