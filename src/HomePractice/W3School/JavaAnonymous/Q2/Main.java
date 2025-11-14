package HomePractice.W3School.JavaAnonymous.Q2;

public class Main {
    public static void main(String[] args) {
        // Anonymous class that implements Greeting
        Greeting greet = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };

        greet.sayHello();
    }
}
