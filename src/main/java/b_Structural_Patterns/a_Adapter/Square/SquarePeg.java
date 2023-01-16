package b_Structural_Patterns.a_Adapter.Square;

// SquarePegs are not compatible with RoundHoles (they were implemented by
// previous development team). But we have to integrate them into our program.

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getWidthSquared() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
