#include <iostream>
#include <string>

class Perro {
public:
    Perro(std::string nombre, int edad, std::string raza) {
        this->nombre = nombre;
        this->edad = edad;
        this->raza = raza;
    }

    void ladrar() {
        std::cout << this->nombre << " esta ladrando" << std::endl;
    }

    void correr() {
        std::cout << this->nombre << " esta corriendo" << std::endl;
    }

    void descansar() {
        std::cout << this->nombre << " esta descansando" << std::endl;
    }

private:
    std::string nombre;
    int edad;
    std::string raza;
};

int main() {
    Perro perro1("Titan", 1, "schnauzer");
    perro1.ladrar();
    perro1.correr();
    perro1.descansar();

    return 0;
}