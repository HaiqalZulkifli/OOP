
import java.util.List;
public class Student {
    private String name;
    private String ic;
    private String address;
    private int year;
    private String schoolName;
    private List<Integer> scores;

    public Student(String name, String ic, String address, int year, String schoolName, List<Integer> scores) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getScores() {
        return scores;
    }
}
