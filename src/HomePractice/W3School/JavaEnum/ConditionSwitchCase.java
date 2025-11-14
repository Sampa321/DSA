package HomePractice.W3School.JavaEnum;

public class ConditionSwitchCase {
    enum Level{
        High,Low,Medium
    }
    public static void main(String[] args) {
        Level myLevel = Level.High;
        switch (myLevel){
            case High:
                System.out.println("High level");
                break;
            case Low:
                System.out.println("Low level");
                break;
            case Medium:
                System.out.println("Medium Level");
                break;
        }
    }


}
