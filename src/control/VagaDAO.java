package control;

import java.lang.reflect.Array;
import java.util.ArrayList;
import model.Pessoa;
public class VagaDAO {

	private static VagaDAO instancia;
	private static ArrayList<VagaDAO> vagas;
	private int[] estacionamento = new int[10];
	
	
	public void cadastrarVaga(int indexVaga) {
		estacionamento[indexVaga] = 1; 
	}
	
	public boolean validaVaga(int indexVaga) {
		if (estacionamento[indexVaga-1] ==1) {
			return false;
		}
		return true;
	}

	public static VagaDAO getInstancia() {

		if (instancia == null) {
			instancia = new VagaDAO();
			vagas = new ArrayList<>();
			//perguntar a professora
		}

		return instancia;

}}
