public class pattern15 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      char a = 65;
      for (int j = 0; j < 5 - i; j++) {
        System.out.print(a + " ");
        a++;
      }
      System.out.println();
    }
  }
}
