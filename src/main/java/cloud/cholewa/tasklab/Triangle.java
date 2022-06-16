package cloud.cholewa.tasklab;

public class Triangle {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getArea() {
        return (a * h) / 2;
    }
}
