package model;

public class Pessoa {

	private String nome;
	private Long cpf;

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
