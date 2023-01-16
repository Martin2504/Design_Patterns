package b_Structural_Patterns.a_Adapter.Round;

// RoundPegs are compatible with RoundHoles.

public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
