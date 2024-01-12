from perro import Perro
from gato import Gato

if __name__ == "__main__":
    perro = Perro()
    gato = Gato()

    print(f"Sonido de perro: {perro.hacer_sonido()}")
    print(f"Sonido de gato: {gato.hacer_sonido()}")