package model;

import java.util.ArrayList;

public interface IPessoaDAO {

	public boolean inserir(Pessoa p);

	public boolean alterar(Pessoa p, long cpf);

	public boolean excluir(Pessoa p, long cpf);

	public ArrayList<Pessoa> listarPessoas();

}
