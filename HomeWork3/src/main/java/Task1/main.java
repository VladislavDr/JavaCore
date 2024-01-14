package Task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Employee fedr = new Employee("Fedr", "DevOps", 1234889, 45454.50, "1987.11.28");
        Employee elena = new Employee("Elena", "Developer", 1234889, 45454.50, "2002.09.14");
        Employee ivanov = new Employee("Ivanov", "Designer", 1234889, 45454.50, "1977.11.28");

        List<Employee> employeeList = new ArrayList<>();
        Collections.addAll(employeeList, fedr, elena, ivanov);

        employeeList.sort((e, e1) -> e.compareTo() - e1.compareTo());

        Director ceiner = new Director("Ceiner", "Director", 15951519, 50000.00, "1993.05.13");

        employeeList.add(ceiner);
        employeeList.forEach(System.out::println);
        System.out.println("==============");

        ceiner.upSalary(employeeList, 30, 1000);
        employeeList.forEach(System.out::println);

    }
}
