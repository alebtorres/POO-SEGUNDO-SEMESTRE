#include <iostream>
#include <string>

class vehiculo {
public:
    std::string marca;
    int velocidad;
    std::string placa;

    vehiculo(std::string marca, int velocidad, std::string placa) {
        this->marca = marca;
        this->velocidad = velocidad;
        this->placa = placa;
    }

    void verificarVelocidad() {
        if (velocidad > 50) {
            std::cout << "Multa aplicada al " << marca << " de placa: " << placa << " ,por exceso de velocidad.\n";
        } else {
            std::cout << "El vehiculo " << marca << " recorre a una velocidad permitida.\n";
        }
    }
};

int main() {
    vehiculo porche1("Porsche", 100, "ABB-1892");
    porche1.verificarVelocidad();

    return 0;
}
