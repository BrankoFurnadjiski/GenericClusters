package GenericCluster;

public class TwoPoints {
    private Point2D primary;
    private Point2D secondary;
    private double distance;

    public TwoPoints(Point2D primary, Point2D secondary) {
        this.primary = primary;
        this.secondary = secondary;
        this.distance = primary.distance(secondary);
    }

    public double getDistance() {
        return distance;
    }

    public String toString() {
        return String.format("%d -> %.3f", secondary.getId(), getDistance());
    }
}
