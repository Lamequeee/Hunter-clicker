package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

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
		btnClicker.setBounds(112, 251, 89, 63);
		contentPane.add(btnClicker);
		
		JButton btnZushi = new JButton("Zushi");
		btnZushi.setBounds(474, 58, 89, 23);
		contentPane.add(btnZushi);
		
		JButton btnIkalgo = new JButton("Ikalgo");
		btnIkalgo.setBounds(474, 121, 89, 23);
		contentPane.add(btnIkalgo);
		
		JButton btnWing = new JButton("Wing");
		btnWing.setBounds(474, 180, 89, 23);
		contentPane.add(btnWing);
		
		JButton btnLeorio = new JButton("Leorio");
		btnLeorio.setBounds(474, 251, 89, 23);
		contentPane.add(btnLeorio);
		
		JButton btnCheetu = new JButton("Cheetu");
		btnCheetu.setBounds(474, 327, 89, 23);
		contentPane.add(btnCheetu);
		
		JButton btnKnov = new JButton("Knov");
		btnKnov.setBounds(474, 404, 89, 23);
		contentPane.add(btnKnov);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(601, 62, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(601, 125, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(601, 184, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setBounds(601, 255, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setBounds(601, 331, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("New label");
		lblNewLabel_1_4.setBounds(601, 408, 46, 14);
		contentPane.add(lblNewLabel_1_4);
	}
}
