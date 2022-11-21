package control;

import java.util.ArrayList;

import model.IVagaDAO;
import model.Pessoa;

public class VagaDAO implements IVagaDAO {

	private static VagaDAO instancia;
	private static ArrayList<VagaDAO> vagas;

	public static VagaDAO getInstancia() {

		if (instancia == null) {
			instancia = new VagaDAO();
			vagas = new ArrayList<>();
			
		}

		return instancia;

	}

	private VagaDAO() {

	}

	@Override
	public boolean inserir(Pessoa p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Pessoa p, long cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Pessoa p, long cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Pessoa> listarPessoas() {
		// TODO Auto-generated method stub
		return null;
	}

}
