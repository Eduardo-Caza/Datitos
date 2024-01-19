package datos;

import javax.swing.*;

public class Datitos {
    private JLabel valor1Label;
    private JLabel Valor2;
    private JTextField val1;
    private JButton saludarButton;
    private JButton sumarButton;
    private JButton limpiarButton;
    private JPanel JPanel4;
    private JPanel JPanel3;
    private JPanel JPanel31;
    private JPanel JPanel32;
    private JPanel JPanel2;
    private JPanel JPanel1;
    private JLabel Nombre;
    private JLabel Union;
    private JButton cerrarButton;
    private JButton unionButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
        public Datitos(){
            /*super("Operaciones");*/
            setContentPanel(pantalla);

            saludarButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "¡Hola!");
                }
            });

            sumarButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int valor1 = Integer.parseInt(val1.getText());
                    int valor2 = Integer.parseInt(Valor2.getText());
                    int resultado = valor1 + valor2;
                    JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                }
            });

            limpiarButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    val1.setText("");
                    Valor2.setText("");
                }
            });

            cerrarButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            unionButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String texto1 = textField1.getText();
                    String texto2 = textField2.getText();
                    String texto3 = textField3.getText();
                    String union = texto1 + texto2 + texto3;
                    JOptionPane.showMessageDialog(null, "La unión es: " + union);
                }
            });
        }

    public static class main {
    }
}

