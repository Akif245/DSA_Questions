import java.util.Scanner;

// Find the smallest  Number in array
public class Day {

    public static void main(String[] args) {
          System.out.println("Enter the size in array");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int arr[]  = new int[n];
          for (int i = 0; i < n; i++) {
                    arr[i] = scan.nextInt();  
          }
for (int i = 0; i < arr.length; i++) {
          if (arr[i]<arr[i+1]) {
                    System.out.println(arr[i]);
          }
          System.out.println(arr[i+1]);
}
    }      
}