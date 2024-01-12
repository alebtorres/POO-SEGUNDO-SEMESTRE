import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {
    public MiVentana() {
        JPanel panel = new JPanel();
        JButton boton = new JButton("Presiona aquí");

        panel.add(boton);
        add(panel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton presionado!");
            }
        });
    }

    public static void main(String[] args) {
        MiVentana ventana = new MiVentana();
        ventana.setVisible(true);
    }
}