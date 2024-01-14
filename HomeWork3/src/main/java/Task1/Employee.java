package Task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee {
    private String FCs;
    private String post;
    private Integer number;
    private Double salare;
    private String age;

    public Employee(String FCs, String post, Integer number, Double salare, String age) {
        this.FCs = FCs;
        this.post = post;
        this.number = number;
        this.salare = salare;
        this.age = age;
    }

    public String getFCs() {
        return FCs;
    }

    public void setFCs(String FCs) {
        this.FCs = FCs;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getSalare() {
        return salare;
    }

    public void setSalare(Double salare) {
        this.salare = salare;
    }

    public String getAge() {
        return age;
    }
    public int getYear(){
        return Integer.parseInt(age.replace(".", ""))/10000;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FCs='" + FCs + '\'' +
                ", post='" + post + '\'' +
                ", number=" + number +
                ", Salare=" + salare +
                ", age=" + age +
                '}';
    }

    public void info() {
        System.out.println("Employee{" +
                "FCs='" + FCs + '\'' +
                ", post='" + post + '\'' +
                ", number=" + number +
                ", Salare=" + salare +
                ", age=" + age +
                '}');
    }

    public String ifnoString(){
        return String.format("Employee{" +
                        "FCs='" + "%s" + '\'' +
                        ", post='" + "%s" + '\'' +
                        ", number=" + "%d" +
                        ", Salare=" + "%f" +
                        ", age=" + "%s }\n"
                , FCs
                , post
                , number
                , salare
                , age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FCs, post, number, salare, age);
    }

    public int compareTo(){
        String strAge = this.age.replace(".", "");
        int newAge = Integer.parseInt(strAge);
        return newAge;
    }
}
