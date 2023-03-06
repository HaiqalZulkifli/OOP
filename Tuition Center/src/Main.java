import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a new tuition center
        TuitionCenter klCenter = new TuitionCenter("1 Jalan Universiti, KL", "Mr. Lim");

        // Create a new tutor
        Tutor tutor1 = new Tutor("John Doe", "123456-78-9012", "2 Jalan Kasturi, KL", "BSc in Math", 5, LocalDate.of(2019, 1, 1));

        // Add the tutor to the center
        klCenter.addTutor(tutor1);

        // Create a new student
        Student student1 = new Student("Jane Smith", "987654-32-1098", "3 Jalan Bunga Raya, KL", 2023, "SMK Taman Desa", Arrays.asList(80, 90, 85));

        // Add the student to the center
        klCenter.addStudent(student1);

        // Get the years of experience of the tutor in the center
        int yearsInKlCenter = tutor1.getYearsInCenter(LocalDate.now());
        System.out.println(tutor1.getName() + " has been in the KL center for " + yearsInKlCenter + " years.");

        // Remove the tutor from the center
        klCenter.removeTutor(tutor1);

        // Remove the student from the center
        klCenter.removeStudent(student1);
    }
}