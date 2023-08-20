import java.util.Scanner;

public class Day1_DSA3 {
    public static void main(String[] args) {
          int res = 0;
          System.out.println("Enter size of the Array");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int arr[] = new int[n];
          System.out.println("Enter the Elements of Array");
          for (int i = 0; i < arr.length; i++) {
                  arr[i] = scan.nextInt();  
          }
          for (int i = 0; i < arr.length; i++) {
                    res = arr[i] + res;
          }
          System.out.println( res +  " Average of Array " + res/n);
          
    }      
}
