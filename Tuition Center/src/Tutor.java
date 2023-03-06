import java.time.LocalDate;
import java.time.Period;

public class Tutor {
    private String name;
    private String ic;
    private String address;
    private String qualification;
    private int yearsExp;
    private LocalDate dateJoined;

    public Tutor(String name, String ic, String address, String qualification, int yearsExp, LocalDate dateJoined) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearsExp = yearsExp;
        this.dateJoined = dateJoined;
    }

    public int getYearsInCenter(LocalDate date) {
        return Period.between(dateJoined, date).getYears();
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

    public String getQualification() {
        return qualification;
    }

    public int getYearsExp() {
        return yearsExp;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }
}