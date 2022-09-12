package day43_abstraction.shape;

public abstract class Shape {

    public final String name;

    public Shape(String name) {
        this.name = name;

    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return name + " | Area: " + area() + " | Perimeter: " + perimeter();
    }
}

/*

Create an abstract class Shape

    define a final variable

    define a constructor to initialize the name of the shape

    define two abstract methods

        area()
        perimeter()
 */