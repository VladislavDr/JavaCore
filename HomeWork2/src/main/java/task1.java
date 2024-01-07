//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[rnd()];
        arr = arrRnd(arr);
        int count = countEvvens(arr);
        if (count == 0) {
            System.out.println(Arrays.toString(arr) + " -> 0");
        } else {
            System.out.println(Arrays.toString(arr) + " -> " + count);
        }


    }
    public static int rnd(){
        Random random = new Random();
        return random.nextInt(1, 20);
    }
    public static int[] arrRnd(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd();
        }
        return arr;
    }

    public static int countEvvens(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
