package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TelaExclusaoEndereco extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExclusaoEndereco frame = new TelaExclusaoEndereco();
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
	public TelaExclusaoEndereco() {
		setTitle("Exclus\u00E3o de Endere\u00E7o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		ArrayList<String> Clientes = ConsultarClientes();
		
		JComboBox cbClientes = new JComboBox(Clientes.toArray());
		cbClientes.setBounds(10, 38, 139, 24);
		contentPane.add(cbClientes);
		
		JLabel lblSelecioneOCliente = new JLabel("Selecione o Cliente :");
		lblSelecioneOCliente.setBounds(21, 11, 128, 14);
		contentPane.add(lblSelecioneOCliente);
	}

	private ArrayList<String> ConsultarClientes() {
		
		ArrayList<String> Clientes = new ArrayList<String>();
		Clientes.add("Ivano");
		Clientes.add("Vilmar");
		Clientes.add("João");
		Clientes.add("Pedro");
		
				return Clientes;
	}
}
