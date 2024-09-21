public class twoDimentionalArr {
  public static void main(String args[]) {

    // How to create 2d Arrays

    int[][] twoD = { { 3, 5, 2 }, { 8, 9, 6 } };

    for (int i = 0; i < twoD.length; i++) {
      System.out.println();
      for (int j = 0; j < twoD[i].length; j++) {
        System.out.print(twoD[i][j] + " ");
      }
    }

    System.out.println();
  }
}
