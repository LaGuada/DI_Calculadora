package calculardora_DI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Font;
import java.awt.Color;

public class Calculadora_Guadalupe_Vargas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_Guadalupe_Vargas frame = new Calculadora_Guadalupe_Vargas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora_Guadalupe_Vargas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 596);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		panel.setPreferredSize(new Dimension(50, 135));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		textField.setText("0");
		panel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		Button button_AC = new Button("AC");
		button_AC.setForeground(new Color(0, 0, 0));
		panel_1.add(button_AC);
		
		Button button_masmenos = new Button("+/-");
		panel_1.add(button_masmenos);
		
		Button button_porcentaje = new Button("%");
		panel_1.add(button_porcentaje);
		
		Button button_division = new Button("/");
		panel_1.add(button_division);
		
		Button button_siete = new Button("7");
		panel_1.add(button_siete);
		
		Button button_ocho = new Button("8");
		panel_1.add(button_ocho);
		
		Button button_nueve = new Button("9");
		panel_1.add(button_nueve);
		
		Button button_multiplicar = new Button("X");
		button_multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_multiplicar);
		
		Button button_uno = new Button("1");
		panel_1.add(button_uno);
		
		Button button_dos = new Button("2");
		panel_1.add(button_dos);
		
		Button button_tres = new Button("3");
		panel_1.add(button_tres);
		
		Button button_sumar = new Button("+");
		panel_1.add(button_sumar);
		
		Button button_cero = new Button("0");
		panel_1.add(button_cero);
		
		Button button_coma = new Button(",");
		panel_1.add(button_coma);
		
		Button button_igual = new Button("=");
		panel_1.add(button_igual);

		
	}

}
