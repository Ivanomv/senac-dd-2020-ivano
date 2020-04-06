package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;

public class TelaCadastroEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField textRua;
	private JTextField textCidade;
	private JTextField textBairro;
	private JTextField textNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroEndereco frame = new TelaCadastroEndereco();
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
	public TelaCadastroEndereco() {
		setTitle("Cadastro de endere\u00E7o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 15, 50, 16);
		contentPane.add(lblRua);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 45, 60, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(9, 80, 48, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(230, 80, 48, 14);
		contentPane.add(lblEstado);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(230, 15, 50, 16);
		contentPane.add(lblNumero);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(230, 44, 60, 16);
		contentPane.add(lblCep);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(42, 114, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(222, 114, 89, 23);
		contentPane.add(btnLimpar);
		
		textRua = new JTextField();
		textRua.setBounds(52, 12, 170, 20);
		contentPane.add(textRua);
		textRua.setColumns(10);
		
		textCidade = new JTextField();
		textCidade.setBounds(52, 77, 170, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
		
		textBairro = new JTextField();
		textBairro.setBounds(52, 42, 170, 20);
		contentPane.add(textBairro);
		textBairro.setColumns(10);
		
		textNumero = new JTextField();
		textNumero.setBounds(278, 12, 110, 20);
		contentPane.add(textNumero);
		textNumero.setColumns(10);
		
		try {
			MaskFormatter mascaraCep = new MaskFormatter("#####-###");
			
			JFormattedTextField txtCep = new JFormattedTextField(mascaraCep);
			txtCep.setBounds(278, 40, 110, 20);
			contentPane.add(txtCep);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> SiglasEstados =  ConsultarEstador();
		
		JComboBox cbSiglaEstado = new JComboBox(SiglasEstados.toArray());
		cbSiglaEstado.setBounds(278, 76, 110, 22);
		contentPane.add(cbSiglaEstado);
	
	}

	private ArrayList<String> ConsultarEstador() {
		ArrayList<String> SiglasEstados = new ArrayList<String>();
		
		SiglasEstados.add("AC");
		SiglasEstados.add("AL");
		SiglasEstados.add("AP");
		SiglasEstados.add("AM");
		SiglasEstados.add("BA");
		SiglasEstados.add("CE");
		SiglasEstados.add("DF");
		SiglasEstados.add("ES");
		SiglasEstados.add("GO");
		SiglasEstados.add("MA");
		SiglasEstados.add("MT");
		SiglasEstados.add("MS");
		SiglasEstados.add("MG");
		SiglasEstados.add("PA");
		SiglasEstados.add("PB");
		SiglasEstados.add("PR");
		SiglasEstados.add("PE");
		SiglasEstados.add("PI");
		SiglasEstados.add("RJ");
		SiglasEstados.add("RN");
		SiglasEstados.add("RS");
		SiglasEstados.add("RO");
		SiglasEstados.add("RR");
		SiglasEstados.add("SC");
		SiglasEstados.add("SP");
		SiglasEstados.add("SE");
		SiglasEstados.add("TO");
		
		
		
		return SiglasEstados;
	}
}
