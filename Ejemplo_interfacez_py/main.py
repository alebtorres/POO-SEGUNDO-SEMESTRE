import PySimpleGUI as sg

def main():
    # Crear una ventana con un botón y un cuadro de texto
    layout = [
        [sg.Text('Nombre:')],
        [sg.Input(key='nombre')],
        [sg.Button('Saludar'), sg.Button('Salir')]
    ]
    window = sg.Window('Interfaz Gráfica', layout)

    # Bucle principal de la ventana
    while True:
        event, values = window.read()

        if event == sg.WIN_CLOSED or event == 'Salir':
            break

        if event == 'Saludar':
            nombre = values['nombre']
            sg.popup(f'¡Hola, {nombre}!')

    # Cerrar la ventana
    window.close()

if __name__ == '__main__':
    main()