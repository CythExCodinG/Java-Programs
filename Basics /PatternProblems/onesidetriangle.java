
import java.util.Scanner;

public class onesidetriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    System.out.print("Enter no of rows :");
    n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println();
      for (int j = 0; j < (i + 1); j++) {
        System.out.print("*\t");
      }
    }
    System.out.println();
  }
}
