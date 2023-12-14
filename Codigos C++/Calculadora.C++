#include <iostream>
#include <string>

class Calculadora {
public:
    static double calcular(std::string number1, std::string operador, std::string number2) {
        double num1 = std::stod(number1);
        double num2 = std::stod(number2);

        if (operador == "+") {
            return num1 + num2;
        } else if (operador == "-") {
            return num1 - num2;
        } else if (operador == "*") {
            return num1 * num2;
        } else if (operador == "/") {
            if (num2 == 0) {
                throw std::invalid_argument("Division por cero");
            }
            return num1 / num2;
        } else {
            throw std::invalid_argument("Operador no válido: " + operador);
        }
    }
};

int main() {
    while (true) {
        try {
            std::cout << "\n----CALCULADORA EXPERIMENTAL ESPE----\n";

            std::string number1;
            std::cout << "Ingrese primer numero: ";
            std::cin >> number1;

            if (number1 == "salir") {
                break;
            }

            std::string operador;
            std::cout << "Ingresa el operador [+,-,*,/] : ";
            std::cin >> operador;

            std::string number2;
            std::cout << "Ingresa segundo numero: ";
            std::cin >> number2;

            double resultado = Calculadora::calcular(number1, operador, number2);
            std::cout << "Resultado de la operación es: " << resultado << std::endl;

        } catch (const std::invalid_argument& exception) {
            std::cout << "Error! " << exception.what() << std::endl;
        } catch (const std::out_of_range& exception) {
            std::cout << "Error! " << exception.what() << std::endl;
        }
    }

    std::cout << "Saliendo....." << std::endl;

    return 0;
}