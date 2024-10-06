public class pattern11 {
  public static void main(String[] args) {
    int start = 0;
    for (int i = 0; i < 5; i++) {
      int print = i;
      if (print % 2 == 0)
        start = 1;
      else
        start = 0;
      for (int j = 0; j <= print; j++) {
        System.out.print(start);
        start = 1 - start;
      }
      System.out.println();
    }
  }
}
