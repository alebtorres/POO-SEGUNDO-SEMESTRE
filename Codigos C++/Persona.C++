#include <iostream>
#include <string>

class Persona {
    private:
        std::string nombre;
        int edad;

    public:
        Persona(std::string nombre, int edad) {
            this->nombre = nombre;
            this->edad = edad;
        }

        void saltar() {
            std::cout << this->nombre << " empezo a saltar" << std::endl;
        }

        void comer() {
            std::cout << this->nombre << " empezo a comer" << std::endl;
        }

        void nadar() {
            std::cout << this->nombre << " empezo a nadar" << std::endl;
        }
};

int main() {
    Persona p2("Alexander", 19);
    p2.saltar();
    p2.comer();
    p2.nadar();

    return 0;
}