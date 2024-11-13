package OOPs.Encapsulation.GetterSetter;

final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class TestImmutablePoint {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(5, 10);
        System.out.println("Point: (" + point.getX() + ", " + point.getY() + ")");
        // point.x = 20; // Error: Cannot assign a value to final variable x
    }
}
