import java.util.Scanner;

public class diamondpattern {
  public static void main(String[] args) {
    int n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no of rows :");
    n = sc.nextInt();
    for (int i = 1; i < 2 * n; i++) {

      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }

      if (i != n) {
        for (int k = 0; k < (2 * i - 1); k++) {
          System.out.print("*");
        }
      }
      if (i>n) {
        for (int m = i; m >= ; m++) {
          
        }
      }
      System.out.println("");
    }
  }
}
