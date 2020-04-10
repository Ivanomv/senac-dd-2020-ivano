package controller.exercicio1;

import java.io.UncheckedIOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.ComboBoxModel;

import model.bo.UsuarioBO;
import model.bo.exercicio1.ClienteBO;
import model.dao.exercicio1.ClienteDAO;
import model.vo.exercicio1.Cliente;

public class ClienteController {

	private ClienteDAO dao = new ClienteDAO();
	private ClienteBO bo = new ClienteBO();

	private static final int TAMANHO_MINIMO_CAMPO_NOME = 3;
	private static final int TAMANHO_MAXIMO_CAMPO_NOME = 255;

	private static final int TAMANHO_MINIMO_CAMPO_SOBRENOME = 3;
	private static final int TAMANHO_MAXIMO_CAMPO_SOBRENOME = 255;

	private static final int TAMANHO_MINIMO_CAMPO_CPF = 11;
	private static final int TAMANHO_MAXIMO_CAMPO_CPF = 11;

	public String salvar(String nome, String sobrenome, String cpf, String endereco) {
		String mensagem = "";

		mensagem += validarCampoDeTexto("Nome", nome, TAMANHO_MINIMO_CAMPO_NOME, TAMANHO_MAXIMO_CAMPO_NOME, true);
		mensagem += validarCampoDeTexto("Sobrenome", sobrenome, TAMANHO_MINIMO_CAMPO_SOBRENOME,
				TAMANHO_MAXIMO_CAMPO_SOBRENOME, true);
		mensagem += validarCampoDeTexto("CPF", cpf, TAMANHO_MINIMO_CAMPO_CPF, TAMANHO_MAXIMO_CAMPO_CPF, true);

		if (mensagem.isEmpty()) {
			Cliente novoCliente = new Cliente(nome, sobrenome, cpf, endereco);
			mensagem = bo.salvar(novoCliente);
		}

		return mensagem;

	}

	private String validarCampoDeTexto(String nomeDoCampo, String valor, int tamanhoMinimo, int tamanhoMaximo,
			boolean obrigatorio) {
		String mensagemValidacao = "";

		if (obrigatorio && valor != null && !valor.isEmpty() || valor.length() < tamanhoMinimo
				|| valor.length() > tamanhoMaximo) {
			mensagemValidacao = nomeDoCampo + " deve possuir pelo menos " + tamanhoMinimo + " e no máximo "
					+ tamanhoMaximo + " caracteres \n";
		}

		return mensagemValidacao;

	}

	public String excluir(String cpfcliente) {

		String mensagem = "";
		try {
			int cpf = Integer.parseInt(cpfcliente);
			mensagem = bo.excluir(cpfcliente);

		} catch (NumberFormatException ex) {
			mensagem = "Informe um cpf Válido";
		}

		if (cpfcliente.length() != 11) {
			mensagem = "Numero tem que conter  11 Digitos nos capos vazios";
		}
		return mensagem;

	}

	public ArrayList<Cliente> listarTodosOsClientes() {
		return dao.consultarTodos();
	}

}
