import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd();
        }
        System.out.println(Arrays.toString(arr));
        writerToFile(arr);
        readFile();
    }

    public static int rnd() {
        Random rnd = new Random();
        int num = rnd.nextInt(0, 4);
        return num;
    }

    public static void writerToFile(int[] arr) {
        try (Writer out = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("newFile.txt"), "UTF-8"))) {
            String blockOne = "";
            String blockTwo = "";
            String blockTree = "";
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length / 3) {
                    blockOne += arr[i];
                } else if (i >= arr.length / 3 && i < arr.length / 3 * 2) {
                    blockTwo += arr[i];
                } else blockTree += arr[i];
            }
            out.write(Integer.parseInt(blockOne));
            out.write(Integer.parseInt(blockTwo));
            out.write(Integer.parseInt(blockTree));
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() {
        try (FileReader fileReader = new FileReader("newFile.txt");
             BufferedReader bf = new BufferedReader(fileReader)) {
            int [] ar = new int[3];
            for (int i = 0; i < 3; i++){
                ar[i] = bf.read();
            }
            System.out.println(Arrays.toString(ar));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
