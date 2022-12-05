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
			System.out.println("2 ALTERAR DADOS DO CLIENTE ");
			System.out.println("3 ALTERAR DADOS DO VEICULO");
			System.out.println("4 EXCLUIR CADASTRO");
			System.out.println("5 LISTAR CADASTROS");
			System.out.println("6 RESERVAR VAGA ESTACIONAMENTO");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Pessoa addPessoa = new Pessoa();
				
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
					addPessoa.setNome(nome);
				} else {

					System.out.println("Erro nome inválido!");
					break;
				}
				if (!cpf.isEmpty()) {
					addPessoa.setCpf(Long.valueOf(cpf));
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
					addPessoa.setIdade(idade);
				}
				if (!telefone.isEmpty()) {
					addPessoa.setTelefone(Long.valueOf(telefone));

				} else {
					System.out.println("Telefone inválido");
					break;
				}

				bancoPessoa.inserir(addPessoa);

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
					
					addPessoa.setMoto(m);
				
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
					
					addPessoa.setCarro(c);
				
				veiculod.listaveiculo.add(c);
				}
			}
			break;
			case 2: {
				
				System.out.println("Digite o cpf da pessoa que deseja alterar:");
				long cpf = Long.valueOf(leitura.nextLine());
				
				p = bancoPessoa.getPessoaByCpf(cpf);
				int index = bancoPessoa.getIndex(p);
				
				//bancoPessoa.alterar(p, cpf);
				
				System.out.println("- DADOS ATUAIS -");
				System.out.println("Nome:"+ p.getNome());
				System.out.println("Cpf:"+p.getCpf());
				System.out.println("Idade:"+p.getIdade());
				System.out.println("Telefone:"+p.getTelefone());
				
				
				System.out.println("- OQUE DESEJA ALTERAR? -");
				System.out.println("1-NOME:");
				System.out.println("2-CPF");
				System.out.println("3-IDADE");
				System.out.println("4-TELEFONE");
				if (p.getMoto().equals(null))		{		
					
			/*		System.out.println("- DADOS DO VEICULO -");
				System.out.println("-"+ p.getCarro().getTipo());
				System.out.println("MARCA:"+p.getCarro().getMarca());
				System.out.println("MODELO:"+ p.getCarro().getModelodocarro());
				System.out.println("PLACA:"+p.getCarro().getPlaca());
				System.out.println("VALVULAS:"+p.getCarro().getQuantvalvulas());
				System.out.println("COR:"+p.getCarro().getCor());*/

				}
				System.out.println("\n 0-SAIR");
				opcaoSelecionada = Integer.valueOf(leitura.nextLine());
				
				switch (opcaoSelecionada) {
				case 0: {
					break;
				}
				case 1: {
					System.out.println("Digite o novo nome desejado:");
					p.setNome(leitura.nextLine());

					bancoPessoa.getTabelaPessoas().set(index, p);
				}	
				break;
				case 2: {
					System.out.println("Digite o novo cpf desejado:");
					p.setCpf(Long.valueOf(leitura.nextLine()));

					bancoPessoa.getTabelaPessoas().set(index, p);
				}	
				break;
				case 3: {
					System.out.println("Digite o novo nome desejado:");
					p.setIdade(Integer.valueOf(leitura.nextLine()));

					bancoPessoa.getTabelaPessoas().set(index, p);
				}	
				break;
				case 4: {
					System.out.println("Digite o novo nome desejado:");
					p.setTelefone(Long.valueOf(leitura.nextLine()));

					bancoPessoa.getTabelaPessoas().set(index, p);
				}	
				break;
				}
			}
			break;
			case 3: {
				System.out.println("Digite o cpf da pessoa que deseja excluir:");
				Long cpf = Long.valueOf(leitura.nextLine());
				
				bancoPessoa.excluir(p, cpf);
			}
			break;
			case 4: {
				ArrayList<Pessoa> lista = bancoPessoa.listarPessoas();
				for (Pessoa pessoa : lista) {
					System.out.println("Cpf: " + pessoa.getCpf());
					System.out.println("Nome: " + pessoa.getNome());
				}
			}
			break;
			case 5: {
				//Digite o numero da sua vaga
				//verifica
				//insere ou informa erro
				
				// TODO
			}
			break;
//reserva da vaga alterar esquema//
			}
			
			
			
			//Pegar carro ou moto
			
		
		
			
			
			
			
			

		}

		leitura.close();
	}
}