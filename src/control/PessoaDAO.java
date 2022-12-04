package control;

import java.util.ArrayList;
import java.util.Scanner;

import model.IPessoaDAO;
import model.Pessoa;

public class PessoaDAO implements IPessoaDAO {
	
	Pessoa p = new Pessoa();
	Scanner leitura = new Scanner(System.in);
	private static ArrayList<Pessoa> tabelaPessoas;
	private static PessoaDAO instancia;

	/**
	 * Torna o construtor da classe privado Para impedir que a classe seja
	 * instanciada
	 */
	private PessoaDAO() {
	}

	/**
	 * Metodo utilizando padrao Singleton impossibilitando que se criem diversos
	 * objetos em memoria RAM apenas se crie um uma unica vez e se manipule o mesmo
	 * 
	 * 
	 * @return
	 */
	public static PessoaDAO getInstancia() {

		if (instancia == null) {
			instancia = new PessoaDAO();
			tabelaPessoas = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Pessoa p) {
		if (p != null) {
			tabelaPessoas.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Pessoa p, long cpf) {
		for (Pessoa pessoa : tabelaPessoas) {

			if (pessoa.getCpf() == cpf) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Pessoa p, long cpf) {
		for (Pessoa pessoa : tabelaPessoas) {
			if (pessoa.getCpf() == cpf) {
				tabelaPessoas.remove(pessoa);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Pessoa> listarPessoas() {
		return tabelaPessoas +  listaveiculo;
	}
	

		

	}

	
