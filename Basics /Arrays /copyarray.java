import java.util.Scanner;

public class copyarray {
  public static void main(String[] args) {
    int n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no of elements :");
    n = sc.nextInt();
    int[] arr1 = new int[n];
    int[] arr2 = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter element " + (i + 1) + " :");
      arr1[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      arr2[i] = arr1[i];
    }
    System.out.println("Array 2 after copying =>");

    for (int i = 0; i < n; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();
    sc.close();

  }
}
