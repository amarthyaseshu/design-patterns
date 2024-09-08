package prototype;

// Circle class implementing Cloneable
// Java Cloneable only does shallow copy sufficient for simple objects (only copies objects not objects referenced by it) but for complex objects need to do
// deep copy by overriding clone mtd
public class Circle implements Cloneable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Calls the Object's clone() method
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}