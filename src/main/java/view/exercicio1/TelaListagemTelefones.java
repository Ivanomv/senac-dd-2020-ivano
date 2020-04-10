package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.exercicio1.ClienteController;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.awt.event.ActionEvent;

public class TelaListagemTelefones extends JFrame {

	private JPanel contentPane;
	private JTable tbtelefones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemTelefones frame = new TelaListagemTelefones();
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
	public TelaListagemTelefones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClienteController controladora = new ClienteController();
				Cliente = Controller.listarTodosOsClientes();
				
				
				
			}
		});
		btnBuscar.setBounds(10, 11, 89, 23);
		contentPane.add(btnBuscar);
		
		tbtelefones = new JTable();
		tbtelefones.setBounds(380, 95, -330, 135);
		contentPane.add(tbtelefones);
	}
}
