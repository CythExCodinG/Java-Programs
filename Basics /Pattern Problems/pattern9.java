
public class pattern9 {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (2 * i) + 1; k++) {
        System.out.print("*" + "");
      }
      System.out.println();
    }
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (2 * 5) - ((2 * i) + 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}