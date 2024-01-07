import java.util.Arrays;

//Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[task1.rnd()];
        arr = task1.arrRnd(arr);
        int diff = 0;

        if (arr.length == 0) {
            System.out.println("Массив пустой!");
        } else {
            diff = Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
            System.out.println(Arrays.toString(arr));
            System.out.println("Difference = " + diff);
        }
    }
}
