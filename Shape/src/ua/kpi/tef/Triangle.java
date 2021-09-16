package ua.kpi.tef;

public class Triangle extends Shape {
    private double x;
    private double y;
    private double z;

    private void canTriangleExist(double a, double b, double c) {
        if (Math.abs(a - b) >= c || (a + b) <= c) {
            throw new IllegalStateException();
        } else if (Math.abs(a - c) >= b || (a + c) >= b) {
            throw new IllegalStateException();
        } else if (Math.abs(b - c) >= a || (b + c) <= a) {
            throw new IllegalStateException();
        }
    }

    Triangle(double a, double b, double c) {
        canTriangleExist(a, b, c);
        this.x = a;
        this.y = b;
        this.z = c;
    }

    @Override
    public double square() {
        double halfPerimeter = perimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter - x)*(halfPerimeter - y)*(halfPerimeter - z));
    }

    @Override
    public double perimeter() {
        return x + y + z;
    }

    @Override
    public void move(double dx, double dy) {
        canTriangleExist(dx, dy, z);
        this.x = dx;
        this.y = dy;
    }
}
