package prototype;

public class PrototypePatternWithJavaClone {
    public static void main(String[] args) {
        try {
            // Original Circle
            Circle originalCircle = new Circle(10);
            System.out.println("Original: " + originalCircle);

            // Clone Circle using built-in clone
            Circle clonedCircle = (Circle) originalCircle.clone();
            System.out.println("Cloned: " + clonedCircle);

            // Original Rectangle
            Rectangle originalRectangle = new Rectangle(20, 15);
            System.out.println("Original: " + originalRectangle);

            // Clone Rectangle using built-in clone
            Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
            System.out.println("Cloned: " + clonedRectangle);

            // Check if the cloned objects are different instances
            System.out.println("Are originalCircle and clonedCircle the same object? " + (originalCircle == clonedCircle));  // false
            System.out.println("Are originalRectangle and clonedRectangle the same object? " + (originalRectangle == clonedRectangle));  // false
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}