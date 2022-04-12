import java.util.Arrays;
import java.util.Scanner;

public class TaskCombinations {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input size array (at least 1) ");
//        int n;
//        while (true){
//            n = sc.nextInt();
//            if(n < 1){
//                System.out.println("Invalid value, try again ");
//            }else break;
//        }
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random()*(50-1));
//        }
        int[] arr = {1, 2, 3, 4};
        int count = factorial(arr.length);
        System.out.println("Number of permutation options " + count);
        combinations(arr,count);
    }

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }

    static void combinations(int[] arr, int n) {
        int maxValue = arr.length - 1;
        int count = maxValue;
        while (n > 0) {
            printArray(arr);
            int temp = arr[count];
            arr[count] = arr[count - 1];
            arr[count - 1] = temp;
            n--;
            if (count < 2) {
                count = maxValue;
            } else {
                count--;
            }
        }
    }
}
