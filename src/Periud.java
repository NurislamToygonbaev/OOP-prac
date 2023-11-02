import java.time.LocalDate;
import java.time.Period;

public class Periud {
    public void getAge(Student student) {
        LocalDate correctDate = LocalDate.now();
        LocalDate dateOfBirth = student.dateOfBirth;

        Period period = Period.between(dateOfBirth, correctDate);
        int years = period.getYears();
        System.out.println(student.getInfo() + "Age: " + years + " \n");
    }
}

