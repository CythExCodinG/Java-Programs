import java.util.Scanner;

public class twodimentional {
  public static void main(String[] args) {
    int row = 0;
    int col = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no of rows :");
    row = sc.nextInt();
    System.out.print("Enter no of columns :");
    col = sc.nextInt();
    int[][] arr = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("Enter element row=>" + (i + 1) + " col=>" + (j + 1) + " : ");
        arr[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < row; i++) {
      System.out.println();
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
    }
    System.out.println();
    sc.close();
  }
}
