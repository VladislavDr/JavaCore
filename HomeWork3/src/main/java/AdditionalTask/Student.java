package AdditionalTask;

import java.util.ArrayList;
import java.util.List;

public class Student implements Assessment{
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

    @Override
    public List<Integer> getAllRang() {
        return getRatings();
    }

    @Override
    public String toString() {
        return "Student{" +
                "FCs: '" + FCs + '\'' +
                ", specialization: '" + specialization + '\'' +
                ", ratings: " + ratings +
                '}';
    }
}
