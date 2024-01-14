package AdditionalTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class main {
    public static void main(String[] args) {
        List<Student> lstStudent = new ArrayList<>();

        Student ivanov = new Student("Ivanov Ivan", "Informatics");
        Student fedorod = new Student("Fedorov Fedor", "Informatics");
        Student obrychkova = new Student("Obrycheva Elena", "DevOps");
        Student okinke = new Student("Okinke Saveliy", "Designer");
        Student kyznecov = new Student("Kyznecov Vladimir", "Informatics");
        Student popov = new Student("Popov Egeniy", "Architecture of the microdisplay");
        Student sokolova = new Student("Sokolova Maria", "Informatics");
        Student novikov = new Student("Novikov Matvei", "Informatics");
        Student orlov = new Student("Orlov Aleksey", "Informatics");

        Collections.addAll(lstStudent, ivanov, fedorod, obrychkova, okinke, kyznecov, popov, sokolova, novikov, orlov);

        lstStudent.forEach(e -> rndRangSteudent(e));
//        lstStudent.forEach(System.out::println);


        System.out.println(
                lstStudent.stream()
                        .filter(e -> e.getSpecialization()
                        .toLowerCase().equals("Informatics".toLowerCase()))
                        .limit(5)
                        .map(e -> e.getFCs() + " " +(e.getAllRang()
                                .stream().map(o -> o.doubleValue())
                                .collect(toList()))
                                .stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0))
                        .toList()
        );


    }

    public static void rndRangSteudent(Student student){
        for (int i = 0; i < Random.rnd()+5; i++){
            student.assessment(Random.rnd());
        }
    }
}
