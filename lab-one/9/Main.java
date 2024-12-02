public class Main {
    public static void main(String[] args) {
        // Create an array of Drawable objects
        Drawable[] drawables = new Drawable[2];
        drawables[0] = new Circle();
        drawables[1] = new Square();

        // Iterate through the array and call draw() on each object
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
