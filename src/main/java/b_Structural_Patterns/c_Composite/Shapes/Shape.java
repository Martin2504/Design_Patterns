package b_Structural_Patterns.c_Composite.Shapes;
import java.awt.*;

// The component interface declares common operations for both
// simple and complex objects of a composition.
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    boolean isSelected();
    void paint(Graphics graphics);
    void unSelect();
}
