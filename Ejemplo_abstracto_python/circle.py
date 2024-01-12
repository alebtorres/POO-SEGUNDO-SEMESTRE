from abc import ABC, abstractmethod

class Circle(ABC):
    def __init__(self, radius):
        self.radius = radius

    def calculate_perimeter(self):
        return 2 * 3.14159 * self.radius