package model;
public class Veiculo  {
	private String placa;
	private String cor;
	private String tipo;
	private	Integer ve;

	public String getTipo() {

		return tipo;
	}

	public Integer getVe() {
		return ve;
	}

	public void setVe(Integer ve) {
		this.ve = ve;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


}