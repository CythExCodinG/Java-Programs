
import java.util.Scanner;

public class additionofmatrix {
  // ARRAY PROGRAM TO PRINT 2D ARRAY
  // ARRAY PROGRAM TO ADD TWO MATRIX
  //
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows:");
    int row = sc.nextInt();

    System.out.println("enter no. of column:");
    int col = sc.nextInt();

    int[][] arr1 = new int[row][col];
    int[][] arr2 = new int[row][col];

    System.out.println("ENTER ELEMENT OF MATRIX 1:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.println("enter element  row=>" + (i + 1) + " colume=>" + (j + 1) + ": ");

        arr1[i][j] = sc.nextInt();
      }
    }
    System.out.println("ENTER ELEMENT OF MATRIX 2");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.println("enter element  row=>" + (i + 1) + " colume=>" + (j + 1) + ": ");
        arr2[i][j] = sc.nextInt();
      }
    }
    // DISPLAYING MATRIX 1
    System.out.println("MATRIX 1:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr1[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println("MATRIX 2:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr2[i][j] + "\t");
      }
      System.out.println();
    }

    int size = row * col;
    int count = 0;
    int flag = 0;
    for (int i = 0; i < row; i++) {
      if (flag == 1) {
        break;
      }
      for (int j = 0; j < col; j++) {
        if (arr1[i][j] == arr2[i][j]) {
          if (count == size) {
            System.out.println("equal");
          }
          count++;
        } else {
          System.out.println("ARRAY 1 AND ARRAY 2 ARE NOT EQUAL");
          flag = 1;
          break;
        }

      }
    }
    sc.close();
  }
}
