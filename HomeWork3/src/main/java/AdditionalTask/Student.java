package AdditionalTask;

import java.util.ArrayList;
import java.util.List;

public class Student implements Assessment, Comparable<Student>{
    private final String FCs;
    private final String specialization;

    private final List<Integer> ratings;

    public Student(String FCs, String specialization) {
        this.FCs = FCs;
        this.specialization = specialization;
        this.ratings = new ArrayList<>();
    }

    public String getFCs() {
        return FCs;
    }

    public String getSpecialization() {
        return specialization;
    }
    public List<Integer> getRatings(){
        return ratings;
    }

    @Override
    public void assessment(Integer rang) {
        ratings.add(rang);
    }


    public double getAvarageRang(){
        return getRatings().stream().mapToDouble(e -> e.doubleValue()).average().orElse(0);
    }
    @Override
    public String toString() {
        return "Student{" +
                "FCs: '" + FCs + '\'' +
                ", specialization: '" + specialization + '\'' +
                ", ratings: " + ratings +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAvarageRang() == o.getAvarageRang()){
            return 0;
        } else if (this.getAvarageRang() > o.getAvarageRang()){
            return 1;
        } else {
            return -1;
        }
    }
}
