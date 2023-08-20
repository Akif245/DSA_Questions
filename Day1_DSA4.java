import java.util.Scanner;

public class Day1_DSA4 {
     public static void main(String[] args) {
          int res =0;
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
          res = res/n;
          for (int i = 0; i < arr.length; i++) {
                 if (arr[i]>res) {
                    System.out.println(  "greater Numbers of array " + arr[i]);
                 }   
          }
     }     
}
