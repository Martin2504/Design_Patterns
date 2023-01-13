package a_Creational_Patterns.d_Prototype.Cache;
import a_Creational_Patterns.d_Prototype.Shapes.Circle;
import a_Creational_Patterns.d_Prototype.Shapes.Rectangle;
import a_Creational_Patterns.d_Prototype.Shapes.Shape;
import java.util.HashMap;
import java.util.Map;

/*  You could implement a centralized prototype registry (or factory),
which would contain a set of pre-defined prototype objects. This way you
could retrieve new objects from the factory by passing its name or other
parameters. The factory would search for an appropriate prototype,
clone it and return you a copy. */

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
