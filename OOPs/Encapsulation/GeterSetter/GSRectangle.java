package OOPs.Encapsulation.GetterSetter;

class GSRectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getArea() {
        return length * width;
    }
}

class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);
        System.out.println("Area: " + rect.getArea());
    }
}
