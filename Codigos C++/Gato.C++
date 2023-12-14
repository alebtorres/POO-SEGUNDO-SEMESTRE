#include <iostream>
#include <string>

class Gato {
public:
    Gato(std::string nombre, int edad, std::string color, std::string altura) {
        this->nombre = nombre;
        this->edad = edad;
        this->color = color;
        this->altura = altura;
    }

    void maullar() {
        std::cout << this->nombre << " esta maullando" << std::endl;
    }

    void saltar() {
        std::cout << this->nombre << " esta saltando" << std::endl;
    }

    void correr() {
        std::cout << this->nombre << " esta corriendo" << std::endl;
    }

    void dormir() {
        std::cout << this->nombre << " esta durmiendo" << std::endl;
    }

private:
    std::string nombre;
    int edad;
    std::string color;
    std::string altura;
};

int main() {
    Gato gat1("Alfred", 2, "Gris con rayas negras", "32cm");
    gat1.maullar();
    gat1.saltar();
    gat1.correr();
    gat1.dormir();

    return 0;
}