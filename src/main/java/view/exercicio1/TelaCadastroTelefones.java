package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.exercicio1.TelefoneController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastroTelefones extends JFrame {

	private JPanel contentPane;
	private JTextField txtcod;
	private JTextField txtnumero;
	private JTextField txtddd;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroTelefones frame = new TelaCadastroTelefones();
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
	public TelaCadastroTelefones() {
		setTitle("Cadastro telefones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 11, 48, 14);
		contentPane.add(lblCliente);

		JLabel lblCdigoPais = new JLabel("C\u00F3digo pais :");
		lblCdigoPais.setBounds(10, 36, 64, 14);
		contentPane.add(lblCdigoPais);

		JLabel lblNumero = new JLabel("numero:");
		lblNumero.setBounds(10, 61, 48, 14);
		contentPane.add(lblNumero);

		JLabel lblDdd = new JLabel("DDD");
		lblDdd.setBounds(10, 86, 48, 14);
		contentPane.add(lblDdd);

		JRadioButton rdbtnMovel = new JRadioButton("Movel");
		rdbtnMovel.setBounds(10, 107, 109, 23);
		contentPane.add(rdbtnMovel);

		JRadioButton rdbtnFixo = new JRadioButton("Fixo");
		rdbtnFixo.setBounds(10, 133, 109, 23);
		contentPane.add(rdbtnFixo);

		

		txtcod = new JTextField();
		txtcod.setBounds(225, 33, 96, 20);
		contentPane.add(txtcod);
		txtcod.setColumns(10);

		txtnumero = new JTextField();
		txtnumero.setBounds(225, 58, 96, 20);
		contentPane.add(txtnumero);
		txtnumero.setColumns(10);

		txtddd = new JTextField();
		txtddd.setBounds(225, 83, 96, 20);
		contentPane.add(txtddd);
		txtddd.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			TelefoneController	 controladora = new TelefoneController	 ();
			
			
			

			}
		});
		btnCadastrar.setBounds(10, 186, 89, 23);
		contentPane.add(btnCadastrar);
		
		JComboBox cbusuario = new JComboBox();
		cbusuario.setBounds(225, 7, 96, 22);
		contentPane.add(cbusuario);
		
		ArrayList<String> usuarios = consultarcliente();
		JComboBox cbusuarios = new JComboBox(usuarios.toArray());
		cbusuario.setBounds(225, 7, 96, 22);
		contentPane.add(cbusuario);

	}

	private ArrayList<String> consultarcliente() {
		ArrayList<String> usuarios = new ArrayList<String>();
		usuarios.add("João");
		usuarios.add("Paulo");
		usuarios.add("Pedro");
		usuarios.add("Marcio");
		
		
		
		return usuarios;
	}
	


	
	}

