package Task2;

public class Buyer {
    private String FCs;
    private Integer age;
    private String number;
    private String sex;

    public Buyer(String FCs, Integer age, String number, String sex) {
        this.FCs = FCs;
        this.age = age;
        this.number = number;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public String getFCs() {
        return FCs;
    }

    public Integer getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "FCs='" + FCs + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
