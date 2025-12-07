import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdivinaPalabraGUI extends JFrame {
    private String palabraSecreta = "JAVA";
    private char[] progreso;
    private JLabel mensaje;
    private JTextField campoTexto;
    private JButton boton;

    public AdivinaPalabraGUI() {
        progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) progreso[i] = '_';

        mensaje = new JLabel(String.valueOf(progreso));
        campoTexto = new JTextField(5);
        boton = new JButton("Intentar letra");

        setLayout(new FlowLayout());
        add(new JLabel("Adivina la palabra letra a letra:"));
        add(mensaje);
        add(campoTexto);
        add(boton);

        boton.addActionListener(e -> {
            String entrada = campoTexto.getText().toUpperCase();
            if (entrada.length() == 1) {
                char letra = entrada.charAt(0);
                boolean acierto = false;
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        progreso[i] = letra;
                        acierto = true;
                    }
                }
                mensaje.setText(String.valueOf(progreso));
                if (String.valueOf(progreso).equals(palabraSecreta)) {
                    JOptionPane.showMessageDialog(this, "¡Felicidades! Has adivinado la palabra.");
                } else if (!acierto) {
                    JOptionPane.showMessageDialog(this, "No está esa letra. Prueba otra.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Introduce solo una letra.");
            }
            campoTexto.setText("");
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(540, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdivinaPalabraGUI();
    }
}
