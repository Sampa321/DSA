package HomePractice.W3School.JavaEnum;
/*
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
 */
public class PrintValue {
    enum Level{
        high,low,medium
    }
    public static void main(String[] args) {
        for(Level myVar :  Level.values())
        {
            System.out.print(myVar+" ");
        }
    }
}
