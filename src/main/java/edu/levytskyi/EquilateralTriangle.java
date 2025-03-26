package edu.levytskyi;
/* @author Sandoplay
 * @project Lab2-test
 * @class EquilateralTriangle
 * @version 1.0.0
 * @since 22.03.2025 - 17.51
 */

public class EquilateralTriangle {

    private double side;

    public EquilateralTriangle(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    // Обчислення периметра
    public double calculatePerimeter() {
        return 3 * side;
    }

    // Обчислення площі
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // Обчислення висоти
    public double calculateHeight() {
        return (Math.sqrt(3) / 2) * side;
    }

    // Обчислення радіуса вписаного кола
    public double calculateInradius() {
        return side / (2 * Math.sqrt(3));
    }

    // Обчислення радіуса описаного кола
    public double calculateCircumradius() {
        return side / Math.sqrt(3);
    }

    // Перевірка, чи є трикутник "великим" (сторона > 10)
    public boolean isLarge() {
        return side > 10;
    }
    // Порівняння з іншим трикутником за площею
    public int compareArea(EquilateralTriangle other) {
        double thisArea = this.calculateArea();
        double otherArea = other.calculateArea();

        return Double.compare(thisArea, otherArea);
    }

    // Масштабування трикутника
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scaling factor must be positive.");
        }
        side *= factor;
    }
}