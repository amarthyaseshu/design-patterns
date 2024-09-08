package prototype;

// Rectangle class implementing Cloneable
// Java Cloneable only does shallow copy sufficient for simple objects (only copies objects not objects referenced by it) but for complex objects need to do
// deep copy by overriding clone mtd
public class Rectangle implements Cloneable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Calls the Object's clone() method
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}