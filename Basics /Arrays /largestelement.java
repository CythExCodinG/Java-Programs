import java.util.Scanner;

public class largestelement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements :");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter Element " + (i + 1) + " : ");
      arr[i] = sc.nextInt();
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println("Largest element is :" + max);
    sc.close();
  }
}
