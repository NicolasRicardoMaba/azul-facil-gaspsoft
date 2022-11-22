package model;

public class Veiculo {

	private String placa;
	private String cor;
 Veiculo veiculo = new Veiculo();
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
public void registraveiculo() {
	System.out.println("Digite a placa do veiculo:");
	veiculo.setPlaca(placa);
	System.out.println("Informe a cor do veiculo:");
	veiculo.setCor(cor);
	}
}
