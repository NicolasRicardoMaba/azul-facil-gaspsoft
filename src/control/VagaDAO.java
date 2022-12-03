package control;

import java.util.ArrayList;
import model.Pessoa;
public class VagaDAO {

	private static VagaDAO instancia;
	private static ArrayList<VagaDAO> vagas;

	public static VagaDAO getInstancia() {

		if (instancia == null) {
			instancia = new VagaDAO();
			vagas = new ArrayList<>();
			//perguntar a professora
		}

		return instancia;

}}
