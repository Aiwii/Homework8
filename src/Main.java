import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1:");
            int[] arr1 = new int[3];
            arr1[0] = 1;
            arr1[1] = 2;
            arr1[2] = 3;

            double[] arr2 = {1.57, 7.654, 9.986};

            int[] arr3 = {25, 50, 75};

        //Task 2
        System.out.println("Task 2:");

        //Вывожу тремя способами.

        for (int i = 0; i < arr1.length; i++){
            if (i < arr1.length - 1) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr3[0] + ", " + arr3[1] + ", " + arr3[2]);

        //Task 3
        System.out.println("Task 3:");
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i >= arr1.length - 2){
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i >= arr2.length - 2){
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i >= arr3.length - 2){
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i]);
            }
        }
        System.out.println();
        //Task 4
        System.out.println("Task 4:");
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] % 2 == 1) {
                ++arr1[i];
        }
        }
        System.out.println(Arrays.toString(arr1));
    }
}