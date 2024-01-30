class Persona:
    def __init__(self,nombre,edad):
        self.nombre=nombre
        self.edad = edad
    # de esta forma accedo al nombre ... funcion que accede a un valor que es privvado de una clase   
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self,new_nombre):
        self.__nombre = new_nombre
        
        
Alexander = Persona("Joel",21)

nombre = Alexander.get_nombre()
print(f'mi nombre es {nombre}')


Alexander.set_nombre("Neicer")


nombre = Alexander.get_nombre