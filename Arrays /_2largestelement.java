public class _2largestelement {
  public static void main(String[] args) {
    int[] arr = { 2, 23, 4, 43, 56, 76, 78 };
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Largest Element in Array is :" + max);
    int sec_max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > sec_max & arr[i] != max) {
        sec_max = arr[i];
      }
    }
    System.out.println("Second largest element in array is :" + sec_max);
  }

}
