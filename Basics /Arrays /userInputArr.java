import java.util.Scanner;

public class userInputArr {
  public static void main(String[] args) {
    int n = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter size of Array");
    n = input.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter element " + (i + 1) + " :");
      arr[i] = input.nextInt();
    }

    System.out.print("Your Array is :");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
