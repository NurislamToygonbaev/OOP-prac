import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2003,4,27);
        LocalDate date2 = LocalDate.of(2002,7,18);
        LocalDate date3 = LocalDate.of(2001,10,12);
        LocalDate date4 = LocalDate.of(2000,8,25);
        LocalDate date5 = LocalDate.of(2005,1,1);
        Student[] student = new Student[]{
                new Student("Nur", date1, 550505050, "Kyrgyz"),
                new Student("Ali", date2, 505679405, "Kyrgyz"),
                new Student("Zhigit", date3, 707543643, "Kyrgyz"),
                new Student("Gul", date4, 555555555, "Kyrgyz"),
                new Student("Nurlan", date5, 777771707, "Kyrgyz")
        };
        Periud periud = new Periud();
        for (Student students: student) {
            periud.getAge(students);
        }
    }
}