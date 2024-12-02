package lab10;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }

    @Override
    public void move() {
        System.out.println("The dog runs on four legs.");
    }
}
