package model;

import java.util.ArrayList;

public interface IVeiculoDAO {

	public boolean inserir(Veiculo v);

	public boolean alterar(Veiculo v, long cpf);
	
	public boolean excluir(Veiculo v, long cpf);

	public ArrayList<Veiculo> listarVeiculos();

}


