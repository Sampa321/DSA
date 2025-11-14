package HomePractice.W3School.JavaAnonymous.Q1;

public class Main {
    public static void main(String[] args) {
        // Anonymous class that overrides makeSound()
        Animal myAnimal = new Animal() {
            public void makeSound() {
                System.out.println("Woof woof");
            }
        }; // semicolon is required to end the line of code that creates the object

        myAnimal.makeSound();
    }
}
