class Estudiante:
    #constructor en python de la clase estudiante
    def __init__ (self,nombre,edad,grado):
        self.nombre =nombre
        self.edad = edad
        self.grado = grado
        
Alexander = Estudiante("Alexander","19","2")

print(Alexander.edad)       