package executavel.exercicio1;

import java.util.ArrayList;

import model.dao.exercicio1.EnderecoDAO;
import model.vo.exercicio1.Cliente;
import model.vo.exercicio1.Endereco;
import model.vo.exercicio1.Telefone;

public class ExecutavelExercicio1 {

	public static void main(String[] argumentosLinhaDeComando) {
		
		//Buscar e mostrar o endereco 1
		EnderecoDAO endDAO = new EnderecoDAO();
		Endereco enderecoConsultado = endDAO.consultarPorId(3);
		System.out.println("EndereÃ§o 3: " + enderecoConsultado.toString());
		
		//JÃ¡ com as tabelas criadas...
		
		Endereco en1 = new Endereco("12","88045369","SC","Florianópolis","Centro","55");
		Endereco en2 = new Endereco("13","88045370","SC","Lages","Centro","56");
		Endereco en3 = new Endereco("14","88045380","SC","Florianópolis","Jardim Atlantico","57");
		Endereco en4 = new Endereco("15","88045390","SC","Chapeco","Centro","58");
		Endereco en5 = new Endereco("16","88045310","SC","Florianópolis","Centro","59");
		
		
		
		//TODO exercÃ­cio 2
		//- Criar 5 clientes
		
		ArrayList<Telefone> clientes = new ArrayList<Telefone>();
		
		
		//- Salvar no banco
		
		
		
		//- Consultar no banco
		
	}
}
