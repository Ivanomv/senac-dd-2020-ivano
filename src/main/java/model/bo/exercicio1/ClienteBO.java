package model.bo.exercicio1;

import java.util.ArrayList;

import model.dao.exercicio1.ClienteDAO;
import model.vo.exercicio1.Cliente;

public class ClienteBO {

	private ClienteDAO dao = new ClienteDAO();

	public ArrayList<Cliente> pesquisarTodos() {
		return dao.consultarTodos();
	}

	// TODO criar os m√©todos para chamar os m√©todos P√öBLICOS no ClienteDAO

	public String excluir(String cpfcliente) {

		String mensagem = "";

		ClienteDAO dao = new ClienteDAO();

		Cliente cliente = ClienteDAO.consultarPorCpf(cpfcliente);

		if (cliente == null) {
			mensagem = "N„o possui Cliente com este Cpf informado";
		} else {
			if (cliente.getTelefones().isEmpty()) {
				if (dao.excluir(cliente.getId())) {
					mensagem = "Cliente foi excluido com Sucesso";

				} else {
					mensagem = "CLiente n„o foi excluido";
				}

			} else {
				mensagem = "Cliente n„o pode ser excluido contem telefone";
			}
		}

		return mensagem;
	}

	public String salvar(Cliente novoCliente, String idSelecionado) {
		String mensagem = "";

		ClienteDAO clienteDAO = new ClienteDAO();
		if (clienteDAO.cpfJaUtilizado(idSelecionado)) {
			mensagem = "Este CPF j· foi Utilizado";
		} else {
			clienteDAO.salvar(idSelecionado);

		}

		return mensagem;
	}

}
