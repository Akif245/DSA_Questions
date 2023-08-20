import java.util.Scanner;

public class Day1_DSA2 {
    public static void main(String[] args) {
          System.out.println("Enter size of the Array");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int arr[] = new int[n];
          System.out.println("Enter the Elements of Array");
          for (int i = 0; i < arr.length; i++) {
                  arr[i] = scan.nextInt();  
          }
          for (int i =arr.length-1; i>=0 ; i--) {
                    System.out.println( " The Reverse Array " + arr[i]);
          }
    }      
}
