package lab10;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog:");
        dog.makeSound();
        dog.move();

        System.out.println();

        System.out.println("Bird:");
        bird.makeSound();
        bird.move();
    }
}
