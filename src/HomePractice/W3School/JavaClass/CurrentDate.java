package HomePractice.W3School.JavaClass;

//Print date today
import java.time.LocalDate;

public class CurrentDate {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
    }
}
