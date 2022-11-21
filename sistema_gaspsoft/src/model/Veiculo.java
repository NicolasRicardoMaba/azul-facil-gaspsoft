package model;

public class Veiculo {

	private String placa, Cor;

 Veiculo veiculo = new Veiculo();
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public void RegistrarVeiculo() {
	System.out.println("informe a cor do veiculo:");
	veiculo.setCor(Cor);
	System.out.println("Informe a placa do veiculo:");
	veiculo.setPlaca(placa);
	
	}
}
