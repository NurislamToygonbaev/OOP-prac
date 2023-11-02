import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dateOfBirth;
    long phoneNumber;
    String nationality;

    public Student(String name, LocalDate dateOfBirth, long phoneNumber, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }
    public Student() {}
    public String getInfo() {
        return STR."""
                   Student:
                name: \{name}
                year: \{dateOfBirth}
                Phone: \{phoneNumber}
                nation: \{nationality}
                """;
    }
}
