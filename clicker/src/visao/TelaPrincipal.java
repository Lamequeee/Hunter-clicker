package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Tela principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClicker = new JButton("Clique");
		btnClicker.setBounds(137, 284, 89, 63);
		contentPane.add(btnClicker);
		
		JButton btnZushi = new JButton("Zushi");
		btnZushi.setToolTipText("Recebera + 1 de Nen");
		btnZushi.setBounds(440, 58, 89, 23);
		contentPane.add(btnZushi);
		
		JButton btnIkalgo = new JButton("Ikalgo");
		btnIkalgo.setToolTipText("Recebera + * 0,5  de Nen");
		btnIkalgo.setBounds(440, 121, 89, 23);
		contentPane.add(btnIkalgo);
		
		JButton btnWing = new JButton("Wing");
		btnWing.setToolTipText("Recebera + * 2  de Nen");
		btnWing.setBounds(440, 180, 89, 23);
		contentPane.add(btnWing);
		
		JButton btnLeorio = new JButton("Leorio");
		btnLeorio.setToolTipText("Recebera + 1000 por minuto de Nen");
		btnLeorio.setBounds(440, 251, 89, 23);
		contentPane.add(btnLeorio);
		
		JButton btnCheetu = new JButton("Cheetu");
		btnCheetu.setToolTipText("Recebera + 10000 por minuto de Nen");
		btnCheetu.setBounds(440, 327, 89, 23);
		contentPane.add(btnCheetu);
		
		JButton btnKnov = new JButton("Knov");
		btnKnov.setToolTipText("Recebera + 50000 por dois minutos  de Nen");
		btnKnov.setBounds(440, 404, 89, 23);
		contentPane.add(btnKnov);
		
		JLabel lblNewLabel = new JLabel("Quantidade:");
		lblNewLabel.setBounds(539, 62, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade:");
		lblNewLabel_1.setBounds(539, 125, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade:");
		lblNewLabel_2.setBounds(539, 184, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade:");
		lblNewLabel_3.setBounds(539, 255, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantidade:");
		lblNewLabel_4.setBounds(539, 331, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade:");
		lblNewLabel_5.setBounds(539, 408, 60, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(599, 59, 70, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(599, 122, 70, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(599, 181, 70, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(599, 252, 70, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(599, 328, 70, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(599, 405, 70, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nen:");
		lblNewLabel_6.setBounds(485, 11, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(539, 8, 130, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/Nen.png")));
		lblNewLabel_7.setBounds(41, 28, 294, 224);
		contentPane.add(lblNewLabel_7);
	}
}
