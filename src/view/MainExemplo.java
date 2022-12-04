package view;

import java.util.ArrayList;
import java.util.Scanner;

import control.PessoaDAO;
import model.Pessoa;
import model.Veiculo;

public class MainExemplo {

	public static void main(String[] args) {
		PessoaDAO p = new PessoaDAO.getInstancia();//olhar exemplo
		Veiculo veiculo = new Veiculo();
		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		PessoaDAO bancoPessoa = PessoaDAO.getInstancia();
		while (opcaoSelecionada != 0) {

			/**
			 * Esta é so uma proposta de menu de sistema.
			 * 
			 * Voce nao precisa seguir esta ordem, desde que seu sistema respeite a logica
			 * de incluir, alterar, listar e excluir de alguma forma.
			 */
			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR CLIENTE");
			System.out.println("2 ALTERAR CLIENTE ");
			System.out.println("3 EXCLUIR CLIENTE");
			System.out.println("4 LISTAR CLIENTES");
			System.out.println("5 RESERVAR VAGA ESTACIONAMENTO");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Pessoa p = new Pessoa();
				System.out.println("Nome:");
				String nome = leitura.nextLine();
			
				System.out.println("Cpf:");
				String cpf = leitura.nextLine();
				System.out.println("Idade:");
				Integer idade = Integer.valueOf(leitura.nextLine());
				System.out.println("Telefone:");
				Integer telefone = Integer.valueOf(leitura.nextLine());
				//fazer validações
				
				if (nome != null) {
				p.setNome(nome);
				}
				else { 
					 
						System.out.println("Erro nome inválido!");
					break;
			}
				if (!cpf.isEmpty()) {
					p.setCpf(Long.valueOf(cpf));
				} else {
					System.out.println("Erro");
				break;
				}
				if (idade >0 && idade<18) {
					System.out.println("menor de idade, não é possível cadastrar seu veículo");
					System.out.println("Recomenda-se Denunciar");
					break;
				}
					else if(idade<=0){
						System.out.println("Idade Inválida!");
						break;
					}
					else {
						p.setIdade(idade);
					}
				}

				bancoPessoa.inserir(p);
				
				System.out.println("/////////////////////////////////////////////");
				System.out.println("Informe a placa do veiculo:");
				veiculo.setPlaca(leitura.nextLine());
	
				System.out.println("O veículo que usará a vaga é uma moto ou carro?");
				System.out.println("1=moto");
				System.out.println("2=carro");
				
				int ve = 0;
				if ( ve == 1) {
					
				}

			}
			case 2: {
				System.out.println("Digite o codigo da pessoa que deseja alterar:");
				// finalizar codigo
			}
			case 3: {
				System.out.println("Digite o codigo da pessoa que deseja excluir:");
				// finalizar codigo
			}
			case 4: {
				ArrayList<Pessoa> lista = bancoPessoa.listarPessoas();
				for (Pessoa pessoa : lista) {
					System.out.println("Cpf: " + pessoa.getCpf());
					System.out.println("Nome: " + pessoa.getNome());
				}
			}
			case 5: {
				// TODO 
			}
//reserva da vaga alterar esquema//
			}

		}

		leitura.close();
	}
}
