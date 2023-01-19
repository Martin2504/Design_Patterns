package b_Structural_Patterns.d_Decorator.Decorators;

// The component interface defines operations that can be
// altered by decorators.
public interface DataSource {

    void writeData(String data);

    String readData();
}
