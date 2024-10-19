package org.example;

import ru.vadim.home.Cube;
import ru.vadim.home.GeometryFigureEquality;
import ru.vadim.home.models.Circle;
import ru.vadim.home.models.Rectangle;
import ru.vadim.home.models.Triangle;

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(15);
    Triangle triangle = new Triangle(10, 10, 8);
    Rectangle rectangle = new Rectangle(13, 8, 13, 8);

    System.out.println("Площадь круга: " + circle.getCircleSquare() + ", длина окружности: " + circle.circumference());
    System.out.println("Площадь треугольника: " + triangle.getTriangleSquare()
            + ", периметр: " + triangle.getTrianglePerimeter());
    System.out.println("Площадь прямоугольника: " + rectangle.getRectangleSquare()
            + ", периметр: " + rectangle.getRectanglePerimeter());

    Triangle triangle2 = new Triangle(10, 10, 8);

    System.out.println("Треугольники triangle и triangle2 равны?: " +
            GeometryFigureEquality.triangleEquality(triangle, triangle2));

    Cube cube = new Cube(10);
    System.out.println("Объём куба равен: " + cube.getVolume());
  }
}