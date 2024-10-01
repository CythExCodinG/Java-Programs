import java.util.Scanner;

public class sparsematrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] arr = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("Enter an element row=>" + (i + 1) + " Column=> " + (j + 1) + ":");
        arr[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    int z = 0, nz = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (arr[i][j] != 0) {
          nz++;
        } else {
          z++;
        }
      }
    }
    int[][] sm = new int[z][nz];
    if (z > nz) {
      int k = 0;
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (arr[i][j] != 0) {
            sm[0][k] = i;
            sm[1][k] = j;
            sm[2][k] = arr[i][j];
            k++;
          }
        }
      }
    }
    System.out.println("********Sparse Matrix********");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < nz; j++) {
        System.err.print(sm[i][j] + " ");
      }
      System.out.println();
    }

  }
}
