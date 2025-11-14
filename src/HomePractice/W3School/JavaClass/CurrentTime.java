package HomePractice.W3School.JavaClass;

//Print current time
import java.time.LocalTime;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime nowTime =LocalTime.now();
        System.out.println(nowTime);
    }
}
