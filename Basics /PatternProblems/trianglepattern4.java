import java.util.Scanner;

public class trianglepattern4 {
  public static void main(String[] args) {
    int n = 0;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println();
      for (int j = 0; j < (n - i - 1); j++) {
        System.out.print("\t");
      }
      for (int k = 0; k < i + 1; k++) {
        System.out.print("*\t");
      }
    }
  }
}
