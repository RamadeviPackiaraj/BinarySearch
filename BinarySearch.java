import java.util.Scanner;
public class BinarySearch{
    public static int binarySearch(int arr[], int N,int x){
        int low =0,high=N-1;
        while(low<=high){
            int mid=low+(high-low)/2;//avoids integer overflow
            
            if(arr[mid]==x)
            return mid;
            
            if(arr[mid]<x)
            low=mid+1;
            
            if(arr[mid]>x)
            high=mid -1;
            }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of sorted array:");
        int N = sc.nextInt(); // Read array size
        
        int[] arr = new int[N]; // Declare sorted array
        System.out.println("Enter " + N + " sorted elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // Read sorted array elements
        }

        System.out.println("Enter the element to search:");
        int x = sc.nextInt(); // Read target element

        int result = binarySearch(arr, N, x);
        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);
        
        sc.close();
    }
}