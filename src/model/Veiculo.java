package model;
public class Veiculo 	{
	private String placa;
	private String cor;
	private String tipo;
	private	Integer ve;
	private String carro;
	private String moto;
	public String getTipo() {

		return tipo;
	}

	public Integer getVe() {
		return ve;
	}

	public void setVe(Integer ve) {
		this.ve = ve;
	}

	public void setTipo(String i) {
		this.tipo = i;
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

	public String getMoto() {
		return moto;
	}

	public void setMoto(String moto) {
		this.moto = moto;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}


}