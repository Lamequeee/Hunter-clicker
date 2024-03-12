package visao;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;


public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textSuzhi;
	private JTextField textIkalgo;
	private JTextField textWing;
	private JTextField textLeorio;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textNen;
	private Timer tm;
	private int contador = 0;
	private boolean rodando = false;
	
	//variaveis
	Double Nen = 0.0;
	int Suzhi = 0;
	Double Ikalgo = 0.50;
	Double Wing = 0.80;
	
	//variaveis para Textfield contar corretamente
	int Wingc = 0;
	int Ikalgoc = 0;
	
	//totais para as somas finais
	Double Ikalgototal = 0.0;
	Double WingTotal = 0.0;
	private JTextField textCrono;

	
	
	
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
	
	Timer timer = new Timer();
	
	
	public TelaPrincipal() {
		setTitle("Tela principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClicker = new JButton("Clique");
		btnClicker.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Nen++;
				Nen += Suzhi;
				
				//SE o contador tiver mais q uma unidade, a variavel IKALGO começara a funcionar, somando o valor ( 0.50 ) a cada unidade comprada
				if(Ikalgoc>=1) {
					Ikalgototal = Ikalgo * Ikalgoc;
				}
				Nen += Ikalgototal;
				
				//SE o contador tiver mais q uma unidade, a variavel WING começara a funcionar, somando o valor ( 0.80 ) a cada unidade comprada
				if(Wingc>=1) {
					WingTotal = Wing * Wingc;
					
				Nen += WingTotal;
				}
				
								
				//converti para string a variavel Nen e o .format foi para fomatar e deixar apenas 2 casas decimais após virgula ( %2.f )
				textNen.setText(String.valueOf(Nen).format("%.2f", Nen));
			}
		});
		
		
		btnClicker.setBounds(137, 284, 89, 63);
		contentPane.add(btnClicker);
		
		JButton btnZushi = new JButton("Zushi");
		btnZushi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Suzhi++;
				textSuzhi.setText(""+Suzhi);				
			}
		});
		btnZushi.setToolTipText("Recebera + 1 de Nen");
		btnZushi.setBounds(440, 58, 89, 23);
		contentPane.add(btnZushi);
		
		JButton btnIkalgo = new JButton("Ikalgo");
		btnIkalgo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ikalgoc++;
				textIkalgo.setText(""+Ikalgoc);
			}
		});
		btnIkalgo.setToolTipText("Recebera + * 0,5  de Nen");
		btnIkalgo.setBounds(440, 121, 89, 23);
		contentPane.add(btnIkalgo);
		
		JButton btnWing = new JButton("Wing");
		btnWing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Wingc++;
				textWing.setText(""+Wingc);
			}
		});
		btnWing.setToolTipText("Recebera + * 0.80  de Nen");
		btnWing.setBounds(440, 180, 89, 23);
		contentPane.add(btnWing);
		
		
		
		JButton btnLeorio = new JButton("Leorio");
		btnLeorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		btnLeorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!rodando) {
					
				
				tm = new Timer();
				tm.scheduleAtFixedRate(new TimerTask(){
					@Override
					public void run() {
						contador++;
						int seg = contador % 60;
						int min = contador / 60;
						min %=60;
						textCrono.setText(String.format("%02d:%02d", min, seg));
						}
					}, 1000,1000);
				}
			}
		}
		);
		
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
		
		textSuzhi = new JTextField();
		textSuzhi.setEditable(false);
		textSuzhi.setBounds(599, 59, 70, 20);
		contentPane.add(textSuzhi);
		textSuzhi.setColumns(10);
		
		textIkalgo = new JTextField();
		textIkalgo.setEditable(false);
		textIkalgo.setColumns(10);
		textIkalgo.setBounds(599, 122, 70, 20);
		contentPane.add(textIkalgo);
		
		textWing = new JTextField();
		textWing.setEditable(false);
		textWing.setColumns(10);
		textWing.setBounds(599, 181, 70, 20);
		contentPane.add(textWing);
		
		textLeorio = new JTextField();
		textLeorio.setEditable(false);
		textLeorio.setColumns(10);
		textLeorio.setBounds(599, 252, 70, 20);
		contentPane.add(textLeorio);
		
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
		
		textNen = new JTextField();
		textNen.setEditable(false);
		textNen.setBounds(539, 8, 130, 20);
		contentPane.add(textNen);
		textNen.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/Nen.png")));
		lblNewLabel_7.setBounds(41, 28, 294, 224);
		contentPane.add(lblNewLabel_7);
		
		
		
		textCrono = new JTextField("00:00:00");
		textCrono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				}
			});
		textCrono.setEditable(false);
		textCrono.setFont(new Font("Tahoma", Font.BOLD, 16));
		textCrono.setBounds(373, 252, 60, 20);
		contentPane.add(textCrono);
		textCrono.setColumns(10);
	}
}
