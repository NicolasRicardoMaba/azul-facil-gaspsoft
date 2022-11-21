package model;

import java.util.ArrayList;

public interface IVagaDAO {

	public boolean inserir(Pessoa p);

	public boolean alterar(Pessoa p, long cpf);

	public boolean excluir(Pessoa p, long cpf);

	public ArrayList<Pessoa> listarPessoas();

}
