
public class factorial {
  public static int fact(int n) {
    int sol = 1;
    for (int i = 1; i <= n; i++) {
      sol = sol * i;
    }
    return sol;
  }

  public static void main(String[] args) {
    int answer = fact(8);
    System.out.println("Factorial is : " + answer);
  }
}
