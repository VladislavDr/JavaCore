package MainPack;
import ServicePackage.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("Если хотите ввести новоую заметку, введите note. Если хотите посмотреть " +
                    "список всех заметок, введите all");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.next();

            switch (text){
                case "note":
                    Service.addNote();
                    break;
                case "all":
                    Service.showAllNotes();
                    break;
            }
        }
    }
}
