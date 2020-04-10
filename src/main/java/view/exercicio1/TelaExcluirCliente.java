package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.exercicio1.ClienteController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExcluirCliente extends JFrame {

	protected static final String JOptionpane = null;
	private JPanel contentPane;
	protected JLabel txtcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExcluirCliente frame = new TelaExcluirCliente();
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
	public TelaExcluirCliente() {
		setTitle("Excluir Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o Cpf :");
		lblDigiteOCpf.setBounds(22, 29, 77, 39);
		contentPane.add(lblDigiteOCpf);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteController controladora = new ClienteController();
				
				
				
				String mensagem = controladora.excluir(txtcpf.getText());
				
				
				
				
				JOptionPane.showMessageDialog(null,mensagem);
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnExcluir.setBounds(116, 126, 89, 23);
		contentPane.add(btnExcluir);
		
		try {
			MaskFormatter mascaracpf = new MaskFormatter("###.###.###-##");
			
			JFormattedTextField txtcpf = new JFormattedTextField(mascaracpf);
			txtcpf.setBounds(109, 38, 96, 20);
			contentPane.add(txtcpf);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
