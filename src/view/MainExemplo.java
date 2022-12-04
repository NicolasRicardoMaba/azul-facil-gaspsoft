package view;

import java.util.ArrayList;
import java.util.Scanner;

import control.PessoaDAO;
import control.VeiculoDAO;
import model.Carro;
import model.Moto;
import model.Pessoa;
import model.Veiculo;

public class MainExemplo {

	public static void main(String[] args) {
		Carro c = new Carro();
		Moto m = new Moto();
		Pessoa p = new Pessoa();
		Veiculo veiculo = new Veiculo();
		VeiculoDAO veiculod = new VeiculoDAO();
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
			System.out.println("- VAGAS AZULFÁCIL -");
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
				System.out.println("Nome:");
				String nome = leitura.nextLine();

				System.out.println("Cpf:");
				String cpf = leitura.nextLine();
				System.out.println("Idade:");
				Integer idade = Integer.valueOf(leitura.nextLine());
				System.out.println("Telefone:");
				String telefone = (leitura.nextLine());
				// fazer validações

				if (nome != null) {
					p.setNome(nome);
				} else {

					System.out.println("Erro nome inválido!");
					break;
				}
				if (!cpf.isEmpty()) {
					p.setCpf(Long.valueOf(cpf));
				} else {
					System.out.println("Erro");
					break;
				}
				if (idade > 0 && idade < 18) {
					System.out.println("menor de idade, não é possível cadastrar seu veículo");
					System.out.println("Recomenda-se Denunciar");
					break;
				}  if (idade <= 0) {
					System.out.println("Idade Inválida!");
					break;
				} else  {
					p.setIdade(idade);
				}
				if (!telefone.isEmpty()) {
					p.setTelefone(Long.valueOf(telefone));

				} else {
					System.out.println("Telefone inválido");
					break;
				}

				bancoPessoa.inserir(p);

				System.out.println("/////////////////////////////////////////////");
	

				System.out.println("O veículo que usará a vaga é uma moto ou carro?");
				System.out.println("1=moto");
				System.out.println("2=carro");
				int ve = Integer.valueOf(leitura.nextLine());
				if (ve == 1) {
					m.setTipo("Moto");
					System.out.println("Informe a placa da moto:");
					m.setPlaca(leitura.nextLine());

					System.out.println("Insira qual o modelo da moto");
					m.setModelomoto(leitura.nextLine());

					System.out.println("Insira qual a quantidade de celindradas da moto:");
					m.setQuantcelindradas(Integer.valueOf(leitura.nextLine()));
					System.out.println("Insira a marca da moto:");
					m.setMarca(leitura.nextLine());
				
				veiculod.listaveiculo.add(m);

				}
				else if (ve == 2) {
					veiculo.setTipo("Carro");
					System.out.println("Informe a placa do carro:");
					c.setPlaca(leitura.nextLine());

					System.out.println("Insira qual o modelo do carro");
					c.setModelodocarro(leitura.nextLine());

					System.out.println("Insira qual a quantidade de valvulas do carro:");
					c.setQuantvalvulas(Integer.valueOf(leitura.nextLine()));
					System.out.println("Insira a marca do carro:");
					c.setMarca(leitura.nextLine());
				
				veiculod.listaveiculo.add(c);
				}

			
			}
			break;
			case 2: {
				
				System.out.println("Digite o cpf da pessoa que deseja alterar:");
				long cpf = Long.valueOf(leitura.nextLine());
				
			bancoPessoa.alterar(p, cpf);
				
				System.out.println("- DADOS ATUAIS -");
				System.out.println("Nome:"+ p.getNome());
				System.out.println("Cpf:"+p.getCpf());
				System.out.println("Idade:"+p.getIdade());
				System.out.println("Telefone:"+p.getTelefone());
				
					System.out.println("- DADOS DO AUTOMÓVEL -");
					System.out.println("Nome:"+ p.getNome());
					System.out.println("Cpf:"+p.getCpf());
					System.out.println("Idade:"+p.getIdade());
					System.out.println("Telefone:"+p.getTelefone());
					
				
				System.out.println("- Oque deseja alterar? -");
				System.out.println("1-NOME:");
				System.out.println("2-CPF");
				System.out.println("3-IDADE");
				System.out.println("4-TELEFONE");
				
				System.out.println("\n 0-SAIR");
				opcaoSelecionada = Integer.valueOf(leitura.nextLine());

				switch (opcaoSelecionada) {
				case 0: {
					break;
				}
				case 1: {
					System.out.println("Digite o novo nome desejado:");
					p.setNome(leitura.nextLine());
					String nome =p.getNome();
					
					bancoPessoa.set(0, nome);
				}	
			}}
			case 3: {
				System.out.println("Digite o cpf da pessoa que deseja excluir:");
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
