import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String pathBackUp = "./backup";
        String pathDirectory = "C:\\Users\\79509\\Desktop\\Java core\\HomeWork";
        backUp(pathBackUp, pathDirectory);
    }
    public static void backUp(String pathBackUp, String pathDic) {
        File dic = new File(pathDic);
        File[] files = dic.listFiles();
        StringBuilder stringBuilder = new StringBuilder();
        for (File file : files) {
            stringBuilder.append(file.getName());
            stringBuilder.append(" ");
        }

        try(FileWriter writer = new FileWriter(pathBackUp);
        BufferedWriter bfWriter = new BufferedWriter(writer)){
            bfWriter.write(String.valueOf(stringBuilder));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
