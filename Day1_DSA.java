import java.util.Scanner;
import java.util.function.Function;

class Multiplicationtable{

           int function(int n){
          for (int i = 1; i <= 10; i++) {
              System.out.println(n + "*" + i + "=" + n*i );     
                    
          }
          return n;
}
public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        Multiplicationtable obj = new Multiplicationtable();
        obj.function(n);
        
        
}
  
}