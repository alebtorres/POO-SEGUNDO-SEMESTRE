from shape import Rectangle
from circle import Circle

if __name__ == "__main__":
    rectangle = Rectangle(4, 6)
    print(f"Perímetro del rectángulo: {rectangle.calculate_perimeter()}")

    circle = Circle(5)
    print(f"Perímetro del círculo: {circle.calculate_perimeter()}")