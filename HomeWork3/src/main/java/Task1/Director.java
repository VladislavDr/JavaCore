package Task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Director extends Employee{
    public Director(String FCs, String post, Integer number, Double salare, String age) {
        super(FCs, post, number, salare, age);
    }

    public void upSalary(List<Employee> employeeList, int age, int salary){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy");
        int now = Integer.parseInt(df.format(date));
        for (Employee employee : employeeList ) {
            if ((now - employee.getYear())  > age && !(employee instanceof Director)){
                employee.setSalare(employee.getSalare() + salary);
            }
        }
    }

    @Override
    public String getFCs() {
        return super.getFCs();
    }

    @Override
    public void setFCs(String FCs) {
        super.setFCs(FCs);
    }

    @Override
    public String getPost() {
        return super.getPost();
    }

    @Override
    public void setPost(String post) {
        super.setPost(post);
    }

    @Override
    public Integer getNumber() {
        return super.getNumber();
    }

    @Override
    public void setNumber(Integer number) {
        super.setNumber(number);
    }

    @Override
    public Double getSalare() {
        return super.getSalare();
    }

    @Override
    public void setSalare(Double salare) {
        super.setSalare(salare);
    }

    @Override
    public String getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(String age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
