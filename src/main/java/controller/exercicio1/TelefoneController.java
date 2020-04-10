package controller.exercicio1;

import model.bo.exercicio1.TelefoneBO;
import model.vo.exercicio1.Telefone;

public class TelefoneController {

	private TelefoneBO bo = new TelefoneBO();

	/**
	 * Salva um novo telefone, validando os valores informados
	 * 
	 * @param novoTelefone o telefone a ser salvo;
	 * @return uma mensagem informando uma das opções a seguir:
	 * 
	 *         (1) há campos para ajustar
	 * 
	 *         (2) salvo com sucesso
	 * 
	 *         (3) erro ao salvar
	 */
	public String salvar(Telefone novoTelefone) {
		String mensagemValidacao = validarCampos(novoTelefone);

		if (mensagemValidacao.isEmpty()) {
			mensagemValidacao = bo.salvar(novoTelefone);
		}
		return mensagemValidacao;
	}

	private String validarCampos(Telefone novoTelefone) {
		String mensagem = "";

		if (novoTelefone == null) {
			mensagem = "Telefone não foi criado";
		} else {
			if (novoTelefone.getDdd().trim().length() != 2) {
				mensagem += "Informe o DDD com 2 dígitos \n";
			}

			try {
				Integer.parseInt(novoTelefone.getDdd());
			} catch (NumberFormatException ex) {
				mensagem += "O DDD deve ser um NÚMERO";
			}
		}

		// TODO fazer mais validações
		// Numero

		// Codigo pais
		return mensagem;
	}

	private String validarCampoNumerico(String valorDoCampo, String nomeDoCampo, int tamanhoMinimo, int tamanhoMaximo) {
		// TODO desenvolver

		return "";
	}
	
	public String Cadastrar(String numero,String ddd,String codigoPais) {
		String mensagem = "";
		if(numero == null) {
			mensagem = "Telefone n�o pode ser criado";
		} else {
			if (codigoPais.trim().length() != 2) {
				mensagem += "Informe o DDD com 2 dígitos \n";
			}

			try {
				Integer.parseInt(ddd);
			} catch (NumberFormatException ex) {
				mensagem += "O DDD deve ser um NÚMERO";
			}
		}

		
		return mensagem;
	}
		
	}
	


