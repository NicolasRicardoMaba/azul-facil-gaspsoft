package control;
import java.util.ArrayList;
import java.util.Scanner;

import model.IVeiculoDAO;
import model.Pessoa;
import model.Veiculo;

public class VeiculoDAO implements IVeiculoDAO {
				Pessoa pessoa = new Pessoa();
	public static ArrayList<Veiculo> getTabelaVeiculo() {
		return tabelaVeiculo;
	}

	public static void setTabelaVeiculos(ArrayList<Veiculo> tabelaVeiculo) {
		VeiculoDAO.tabelaVeiculo = tabelaVeiculo;
	}

	Veiculo v = new Veiculo();
	Scanner leitura = new Scanner(System.in);
	private static ArrayList<Veiculo> tabelaVeiculo;
	private static VeiculoDAO instancia;

	/**
	 * Torna o construtor da classe privado Para impedir que a classe seja
	 * instanciada
	 */
	private VeiculoDAO() {
	}

	/**
	 * Metodo utilizando padrao Singleton impossibilitando que se criem diversos
	 * objetos em memoria RAM apenas se crie um uma unica vez e se manipule o mesmo
	 * 
	 * 
	 * @return
	 */
	public static VeiculoDAO getInstancia() {

		if (instancia == null) {
			instancia = new VeiculoDAO();
			tabelaVeiculo = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Veiculo v) {
		if (v != null) {
			tabelaVeiculo.add(v);
			return true;
		}
		return false;
	}

	//@Override
	public void alterar(Veiculo v, int index) {
		tabelaVeiculo.set(index, v);
		//arrumar o retorno
		
	}



	@Override
	public ArrayList<Veiculo> listarVeiculos() {
		return tabelaVeiculo ;
	}

	public int getIndex(Veiculo v) {
		for (int i = 0; i < tabelaVeiculo.size(); i++) {
			Veiculo v1 = tabelaVeiculo.get(i);
			if (v1==v) {
				return i;
			}
		}
		return -1;
	}


	@Override
	public boolean alterar(Veiculo v, long cpf) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

		

	}