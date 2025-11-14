package HomePractice.W3School.JavaClass;

//Show current date and time

import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
    }
}
