package HomePractice.W3School.JavaEnum;

public class EnumConstructorExample {
    enum Level {
        // Enum constants (each has its own description)

        high("high level"), low("low level"), medium("Medium level");

        // Field (variable) to store the description text
        private String description;

        // Constructor (runs once for each constant above)
        private Level(String description) {
            this.description = description;
        }

        // Getter method to read the description
        public String getDescription() {
            return description;
        }
    }
    public static void main(String[] args) {
        Level myLevel = Level.low;   // Pick one enum constant
        System.out.println(myLevel.getDescription());   // Prints "Medium level"


        for (Level myVar : Level.values()) {
            System.out.println(myVar + ": " + myVar.getDescription());
        }
    }
}
