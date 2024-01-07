package ServicePackage;

import NotePackage.Note;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Service {
    public static void addNote(){
        System.out.println("Введите заметку: ");
        Scanner scanner = new Scanner(System.in);
        String textNote = scanner.nextLine();

        SimpleDateFormat formatter= new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());

        Note.addNote(textNote, (formatter.format(date)));
    }

    public static void showAllNotes(){
        Note.showAllNotes();
    }
}
