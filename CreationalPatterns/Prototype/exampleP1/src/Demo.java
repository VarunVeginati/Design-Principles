import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;
import java.util.List;

// prototype isn't that important. It's usage is very minimal
public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius =15;
        circle.color = "red";
        shapes.add(circle);

        Circle circle1 = (Circle) circle.clone();
        shapes.add(circle1);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "green";
        shapes.add(rectangle);

        for (Shape shape: shapes) {
            shapesCopy.add(shape.clone());
        }

        compare(shapes, shapesCopy);
    }

    public static void compare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
