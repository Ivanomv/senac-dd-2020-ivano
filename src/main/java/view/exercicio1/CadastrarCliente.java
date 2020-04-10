package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.exercicio1.ClienteController;
import model.vo.exercicio1.Endereco;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class CadastrarCliente extends JFrame {

	
	
	private JPanel contentPane;
	private JTextField txtsobrenome;
	private JTextField txtnome;
	private JTextField txtcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente frame = new CadastrarCliente();
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
	public CadastrarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Digite o  seu Nome:");
		lblNome.setBounds(24, 11, 145, 20);
		contentPane.add(lblNome);

		JLabel lblSobrenome = new JLabel(" Digite o seu Sobrenome :");
		lblSobrenome.setBounds(24, 59, 156, 14);
		contentPane.add(lblSobrenome);

		JLabel lblcpf = new JLabel("Digite seu Cpf :");
		lblcpf.setBounds(22, 105, 145, 14);
		contentPane.add(lblcpf);

		JLabel lblEndereco = new JLabel("Selecione o Endere\u00E7o :");
		lblEndereco.setBounds(22, 153, 145, 14);
		contentPane.add(lblEndereco);

		final JComboBox cbendereco = new JComboBox();
		cbendereco.setBounds(190, 149, 145, 22);
		contentPane.add(cbendereco);

		try {
			MaskFormatter mascaracpf = new MaskFormatter("###.###.###-##");

			JFormattedTextField txtcpf = new JFormattedTextField(mascaracpf);
			txtcpf.setBounds(190, 102, 145, 20);
			contentPane.add(txtcpf);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		txtsobrenome = new JTextField();
		txtsobrenome.setBounds(190, 56, 145, 20);
		contentPane.add(txtsobrenome);
		txtsobrenome.setColumns(10);

		txtnome = new JTextField();
		txtnome.setBounds(190, 11, 145, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);

		JButton btnsalvar = new JButton("Salvar");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	ClienteController controladora = new ClienteController();
	
	
	       String mensagem = Controller.salvar(txtnome.getText(),txtsobrenome.getText(),txtcpf.getText(),(String)cbendereco.getSelectedItem());
	       
	       
	       
	       
	       JOptionPane.showConfirmDialog(null, mensagem);
	       
	       
				
				
				
	
				
				
				
			}
		});
		btnsalvar.setBounds(22, 209, 128, 23);
		contentPane.add(btnsalvar);
	}
}
