
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorLayout extends JFrame {

    JTextField textField;
    JPanel panelTombol;

    public KalkulatorLayout() {
        setTitle("Kalkulator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // tengah layar

        // Text Field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        add(textField, BorderLayout.NORTH);

        // Panel Tombol
        panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 6, 5, 5));

        // Label tombol sesuai gambar
        String[] tombol = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "=", "%", "Mod", "Exit"
        };

        for (String label : tombol) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 14));

            // Aksi untuk tombol Exit
            if (label.equals("Exit")) {
                btn.addActionListener(e -> System.exit(0));
            }

            panelTombol.add(btn);
        }

        add(panelTombol, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new KalkulatorLayout().setVisible(true);
        });
    }
}
