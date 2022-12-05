package model;

public class Pessoa {
	
	private String nome;
	private Long cpf;
	private Integer idade;
	private Long telefone;
	private Carro carro;
	private Moto moto;
	private Integer vagaAssociada;

	public Carro getCarro() {
		return carro;
	}

	public Integer getVagaAssociada() {
		return vagaAssociada;
	}

	public void setVagaAssociada(Integer vagaAssociada) {
		this.vagaAssociada = vagaAssociada;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Pessoa(String nome, Long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}


	
}
