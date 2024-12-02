interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

public class DrawableExample {

    public static void main(String[] args) {
        Drawable[] drawableObjects = new Drawable[2];
        drawableObjects[0] = new Circle();
        drawableObjects[1] = new Square();

        for (Drawable drawable : drawableObjects) {
            drawable.draw();
        }
    }
}
