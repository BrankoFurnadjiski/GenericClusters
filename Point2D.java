package GenericCluster;

public class Point2D {
    private long id;
    private float x;
    private float y;

    public Point2D(long id, float x, float y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public double distance(Point2D point) {
        return Math.sqrt((x-point.x)*(x-point.x) + (y-point.y)*(y-point.y));
    }

    public long getId() {
        return id;
    }

}
