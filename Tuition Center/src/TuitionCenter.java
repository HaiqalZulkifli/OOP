
import java.util.ArrayList;
import java.util.List;

public class TuitionCenter {
    private String address;
    private String headMaster;
    private List<Tutor> tutors;
    private List<Student> students;

    public TuitionCenter(String address, String headMaster) {
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
    }

    public void removeTutor(Tutor tutor) {
        tutors.remove(tutor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public String getAddress() {
        return address;
    }

    public String getHeadMaster() {
        return headMaster;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public List<Student> getStudents() {
        return students;
    }
}
