package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaErro extends JFrame {


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaErro frame = new TelaErro();
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
	
	
	public TelaErro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFecharJanela = new JLabel("X");
		lblFecharJanela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); //fecha a janela quando clicado no jlabel
			}
		});
		
		lblFecharJanela.setForeground(new Color(255, 0, 0));
		lblFecharJanela.setFont(new Font("Wide Latin", Font.BOLD, 25));
		lblFecharJanela.setBounds(384, 11, 40, 37);
		contentPane.add(lblFecharJanela);
		
		JLabel lblNewLabel = new JLabel("Erro ao realizar a compra!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(102, 95, 255, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblVocTem = new JLabel("Você tem:");
		lblVocTem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVocTem.setBounds(21, 147, 96, 28);
		contentPane.add(lblVocTem);
		
		JLabel lblDeNen = new JLabel("de Nen, é necessario 10!");
		lblDeNen.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDeNen.setBounds(175, 147, 226, 28);
		contentPane.add(lblDeNen);
		
		textPassar = new JTextField();
		textPassar.setHorizontalAlignment(SwingConstants.CENTER);
		textPassar.setFont(new Font("Tahoma", Font.BOLD, 18));
		textPassar.setForeground(new Color(0, 0, 0));
		textPassar.setEditable(false);
		textPassar.setBounds(112, 147, 61, 28);
		contentPane.add(textPassar);
		textPassar.setColumns(10);
		
		
		//----------------------CONFIGURAÇÃO PARA NÃO TER BARRA SUPERIOR ( TITULO )----------------------
		
		// Configurações da janela
        
        setBounds(100, 100, 450, 300);
        
        // Remover o título da janela
        setUndecorated(true);
                
        
	}
	
	private JTextField textPassar;
	
	public void recebe(String recebe) {
		textPassar.setText(recebe);
    }
}
