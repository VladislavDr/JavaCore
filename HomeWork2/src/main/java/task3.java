import java.util.Arrays;
import java.util.Random;

//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class task3 {
    public static void main(String[] args) {
        int[] arr = new int[task1.rnd()];
        arr = arrRnd(arr);
        boolean bool = boolArr(arr);
        System.out.println(Arrays.toString(arr) + " <- текущий массив");
        if (bool == false) {
            System.out.println("Нет двух соседних нулевых значений в массиве");
        } else System.out.println("Есть соседние нулевые значения в массиве");


    }

    public static boolean boolArr(int[] arr) {
        boolean bool = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                bool = true;
            }
        }
        return bool;
    }

    public static int[] arrRnd(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            int rnd = random.nextInt(0, 5);
            arr[i] = rnd;
        }
        return arr;
    }
}
