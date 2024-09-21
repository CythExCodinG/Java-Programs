import java.util.Scanner;

public class reversetriangle {
  public static void main(String[] args) {
    int n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no of rows :");
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println();
      for (int j = 0; j < n - i; j++) {
        System.out.print("*\t");
      }
    }
    System.out.println();
  }
}
