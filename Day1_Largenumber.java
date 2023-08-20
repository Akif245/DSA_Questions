import java.util.Scanner;

public class Day1_Largenumber {

          
   public static void main(String[] args) {
          System.out.println("Enter size of the Array");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int arr[] = new int[n];
          System.out.println("Enter the Elements of Array");
          for (int i = 0; i < arr.length; i++) {
                  arr[i] = scan.nextInt();  
          }
          int temp = 0;
          for (int i = 0; i < arr.length-1; i++) {
                    if (arr[i]<arr[i+1]) {
                       arr[i] = arr[i+1];
                      temp = arr[i+1];
          
                    }  
            }
            System.out.println( " The Answer is " + temp);
   }       
}