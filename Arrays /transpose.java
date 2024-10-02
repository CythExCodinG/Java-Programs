import java.util.Scanner;

public class transpose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = 0, col = 0;
    System.out.print("Enter no of rows :");
    rows = sc.nextInt();
    System.out.print("Enter no of columns :");
    col = sc.nextInt();

    int[][] arr = new int[rows][col];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("Enter element at " + (i + 1) + " row and " + (j + 1) + " column :");
        arr[i][j] = sc.nextInt();
      }
    }

    int[][] tranpose = new int[rows][col];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < col; j++) {
        tranpose[j][i] = arr[i][j]; // Transpose[j][i] is taken so that rows and col gets interchanged
      }
    }
    System.out.println("Original Array is :");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Transpose Array is :");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(tranpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}
