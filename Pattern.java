import java.util.Scanner;

 public class Pattern {
  
  static void printSquare(int n){

    for(int i = 0; i<n; i++){
      for(int j = 0; j< 0; j++){
        System.out.print("*");
        if(j<n -1){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
 
    }
     public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enetr a number");
      int n = sc.nextInt();

      printSquare(n);
      sc.close(); 
     }

    

} 


