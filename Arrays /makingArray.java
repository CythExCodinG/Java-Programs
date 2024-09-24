public class makingArray {
    public static void main(String[] args) {
        String name = "Rohit";
        System.out.println(name);

        // Creating array
        int[] arr = new int[2];
        arr[0] = 4;
        arr[1] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        // when we know how many eleements are there in array we can diretly assing
        // elements to array in way below
        int[] marks = { 1, 5, 3, 7 };
        System.out.println(marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
    }
}
