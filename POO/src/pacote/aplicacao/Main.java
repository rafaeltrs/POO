package pacote.aplicacao;

import java.util.Date;
import pacote.projeto.Empregado;
import pacote.dao.EmpregadoDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpregadoDAO empregadoDAO = new EmpregadoDAO();
		
		Empregado empregado = new Empregado();
		
		//Inserção dos dados INSERT
		
		empregado.setDepartamento(1);
		empregado.setNome("Rafael Alves");
		empregado.setSalario(2295.22);
		empregado.setEndereco("Rua do Limoeiro, 230");
		empregado.setTelefone(1124608423);
		
		//empregadoDAO.Cadastrar(empregado);
		
		//Atualização do contato
		Empregado e1 = new Empregado();
		e1.setDepartamento(2);
		e1.setNome("Alexandre Guimaraes");
		e1.setSalario(1895.22);
		e1.setEndereco("Rua da Laranjeira, 129");
		e1.setTelefone(2143122384);	
		e1.setCod_empregado(1); //PK do Banco de dados | Para atualizar
		
		//empregadoDAO.Atualizar(e1);
		
		//Deletar o empregado pelo Código de Empregado
		empregadoDAO.DeletarPeloCod(3);
		
		//Visualização dos dados SELECT
		
		for(Empregado emp : empregadoDAO.getEmpregados()) {
			System.out.println("Cod_Emp: " + emp.getCod_empregado());
			System.out.println("Cod_Depto: " + emp.getDepartamento());
			System.out.println("Nome: " + emp.getNome());
			System.out.println("Salario: " + emp.getSalario());
			System.out.println("Endereço: " + emp.getEndereco());
			System.out.println("Telefone: " + emp.getTelefone());
			System.out.println("-----------------------");
		}
	}

}
