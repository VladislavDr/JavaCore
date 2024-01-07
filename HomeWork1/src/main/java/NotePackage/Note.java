package NotePackage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class Note {
    public static void  addNote(String text, String data) {
        File file = new File("notes.txt");

        {
            try {
                FileWriter fw = new FileWriter(file, true);
                fw.write(text + " ");
                fw.write(data + "\n");
                fw.flush();
                System.out.println("Успешно добавлена новая заметка: \n" + text + "\n" + "от " + data);
            } catch (IOException e) {
                System.out.println("Ошибка записи файла");
            }
        }
    }

    public static void showAllNotes() {

//        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null) {
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//            }
//            String everything = sb.toString();
//            System.out.println(everything);
//        } catch (IOException e) {
//            System.out.println("Ошибка чтения файла");
//        }

        try {
            List<String> content = Files.readAllLines(Paths.get("notes.txt"));
            content.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
