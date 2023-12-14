#include <iostream>
#include <string>
#include <cctype>

class Sucursales {
public:
    void elegir() {
        std::cout << "Por favor, elige una sucursal: 1, 2 o 3" << std::endl;
        std::cin >> sucursal;

        switch (sucursal) {
            case 1:
                std::cout << "Has elegido la sucursal 1" << std::endl;
                break;
            case 2:
                std::cout << "Has elegido la sucursal 2" << std::endl;
                break;
            case 3:
                std::cout << "Has elegido la sucursal 3" << std::endl;
                break;
            default:
                std::cout << "Opcion no valida" << std::endl;
                break;
        }

        std::cout << "Por favor, elige un producto: A, B o C" << std::endl;
        std::cin >> producto;

        producto = toUpperCase(producto);

        if (producto == "A") {
            std::cout << "Has elegido el producto A de la sucursal " << sucursal << std::endl;
        } else if (producto == "B") {
            std::cout << "Has elegido el producto B de la sucursal " << sucursal << std::endl;
        } else if (producto == "C") {
            std::cout << "Has elegido el producto C de la sucursal " << sucursal << std::endl;
        } else {
            std::cout << "Opcion no valida" << std::endl;
        }
    }

private:
    int sucursal;
    std::string producto;

    std::string toUpperCase(std::string producto) {
        for (int i = 0; i < producto.length(); i++) {
            if (islower(producto[i])) {
                producto[i] = toupper(producto[i]);
            }
        }
        return producto;
    }
};

int main() {
    Sucursales objeto_principal;
    objeto_principal.elegir();

    return 0;
}