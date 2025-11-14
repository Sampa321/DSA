package HomePractice.W3School.JavaEnum;

public class Main {
    enum Level{
        High,Low,Medium
    }
    public static void main(String[] args) {
       Level myLevel = Level.Low;
        System.out.println(myLevel);
    }
}
