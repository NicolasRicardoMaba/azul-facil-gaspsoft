package control;

import java.util.ArrayList;
import java.util.Scanner;

import model.IPessoaDAO;
import model.Pessoa;

public class PessoaDAO implements IPessoaDAO {
	
	public static ArrayList<Pessoa> getTabelaPessoas() {
		return tabelaPessoas;
	}

	public static void setTabelaPessoas(ArrayList<Pessoa> tabelaPessoas) {
		PessoaDAO.tabelaPessoas = tabelaPessoas;
	}

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

	//@Override
	public void alterar(Pessoa p, int index) {
		tabelaPessoas.set(index, p);
		//arrumar o retorno
		
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
		return tabelaPessoas ;
	}

	public int getIndex(Pessoa p) {
		for (int i = 0; i < tabelaPessoas.size(); i++) {
			Pessoa p1 = tabelaPessoas.get(i);
			if (p1==p) {
				return i;
			}
		}
		return -1;
	}
	
	public Pessoa getPessoaByCpf(long cpf) {
		for (Pessoa pessoa : tabelaPessoas) {

			if (pessoa.getCpf() == cpf) {
				return pessoa;
			}
		}
		return null;
	}

	@Override
	public boolean alterar(Pessoa p, long cpf) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

		

	}

	