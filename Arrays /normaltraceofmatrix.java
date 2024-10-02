import java.util.Scanner;

/**
 * trace
 */
class trace {
  static int findTrace(int[][] arr, int row, int col) {
    int sum = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum += arr[i][j] * arr[i][j];
      }
    }
    return sum;
  }
}

public class normaltraceofmatrix {
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
    System.out.println("Trace of Matrix is :" + trace.findTrace(arr, rows, col));
  }
}
