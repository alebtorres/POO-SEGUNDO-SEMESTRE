package Interfaz_grafica_Java;

import javax.swing.*;

public class Ventana extends JFrame {

    private JLabel etiqueta, etiqueta2, etiqueta3, etiqueta4, etiqueta5;
    private JTextField texto, texto2, texto3, texto4, texto5;

    public Ventana() {
        setTitle("Bienvenido");
        setLayout(null);

        etiqueta = new JLabel("Nombre");
        etiqueta.setBounds(10, 20, 200, 35);
        add(etiqueta);

        etiqueta2 = new JLabel("Ocupacion");
        etiqueta2.setBounds(10, 80, 100, 35);
        add(etiqueta2);

        etiqueta3 = new JLabel("Nacionalidad");
        etiqueta3.setBounds(10, 140, 100, 35);
        add(etiqueta3);

        etiqueta4 = new JLabel("Edad");
        etiqueta4.setBounds(10, 200, 100, 35);
        add(etiqueta4);

        etiqueta5 = new JLabel("Antiguedad");
        etiqueta5.setBounds(10, 260, 100, 35);
        add(etiqueta5);

        texto = new JTextField("");
        texto.setBounds(110, 20, 200, 35);
        add(texto);

        texto2 = new JTextField("");
        texto2.setBounds(110, 80, 200, 35);
        add(texto2);

        texto3 = new JTextField("");
        texto3.setBounds(110, 80, 200, 35);
        add(texto3);

        texto4 = new JTextField("");
        texto4.setBounds(110, 200, 200, 35);
        add(texto4);

        texto5 = new JTextField("");
        texto5.setBounds(110, 260, 200, 35);
        add(texto5);

    }

    public static void main(String[] args) {

        Ventana ventana = new Ventana();
        ventana.setBounds(0, 0, 600, 600);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
