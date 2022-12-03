package control;
import java.util.Scanner;
import control.VeiculoDAO;

import java.util.ArrayList;

import model.Veiculo;

public class VeiculoDAO {
   
    Scanner leitura = new Scanner(System.in);
    public static ArrayList<Veiculo> listaveiculo = new ArrayList();
    public void registraveiculo() {

    	Veiculo veiculo = new Veiculo();
    	System.out.println("Digite a placa do veiculo:");
    	 String placa = leitura.nextLine();
    	veiculo.setPlaca(placa);
    	System.out.println("Informe a cor do veiculo:");
    	   String cor = leitura.nextLine();
    	veiculo.setCor(cor);
    	control.VeiculoDAO.listaveiculo.addAll(cor + placa);
     //amanhã falar com a prof sobre isso no atendimento não recebe o argumento
    	}
    }



