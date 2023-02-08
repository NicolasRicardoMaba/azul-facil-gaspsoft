package view;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import control.PessoaDAO;
import control.VagaDAO;
import control.VeiculoDAO;
import model.Carro;
import model.Moto;
import model.Pessoa;
import model.Veiculo;

public class MainExemplo {

	public static void main(String[] args) {
		VagaDAO vaga = new VagaDAO();
		Carro c = new Carro();
		Moto m = new Moto();
		Pessoa p = new Pessoa();
		Veiculo veiculo = new Veiculo();
		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		PessoaDAO bancoPessoa = PessoaDAO.getInstancia();
		VeiculoDAO bancoVeiculo = VeiculoDAO.getInstancia();
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
			System.out.println("6 LISTAR VEICULOS");
			System.out.println("7 RESERVAR VAGA ESTACIONAMENTO");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Pessoa addPessoa = new Pessoa();
				addPessoa.setVagaAssociada(null);
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
				 veiculo.setVe (Integer.valueOf(leitura.nextLine()));
				if (veiculo.getVe() == 1) {
					m.setVe(1);
					m.setTipo("Moto");
					System.out.println("Informe a placa da moto:");
					m.setPlaca(leitura.nextLine());

					System.out.println("Insira qual o modelo da moto");
					m.setModelomoto(leitura.nextLine());

					System.out.println("Insira qual a quantidade de celindradas da moto:");
					m.setQuantcelindradas(Integer.valueOf(leitura.nextLine()));
					System.out.println("Insira a marca da moto:");
					m.setMarca(leitura.nextLine());
					System.out.println("Insira a cor da moto");
					m.setCor(leitura.nextLine());
				
					bancoVeiculo.inserir(m);

				

				}
				else if (veiculo.getVe() == 2) {
					c.setVe(2);
					c.setTipo("Carro");
					System.out.println("Informe a placa do carro:");
					c.setPlaca(leitura.nextLine());

					System.out.println("Insira qual o modelo do carro");
					c.setModelodocarro(leitura.nextLine());

					System.out.println("Insira qual a quantidade de valvulas do carro:");
					c.setQuantvalvulas(Integer.valueOf(leitura.nextLine()));
					System.out.println("Insira a marca do carro:");
					c.setMarca(leitura.nextLine());
					System.out.println("Insira a cor do carro");
					c.setCor(leitura.nextLine());
				
					bancoVeiculo.inserir(c);
				}
			}
			break;
			case 2: {
				
				System.out.println("Digite o cpf da pessoa que deseja alterar:");
				long cpf = Long.valueOf(leitura.nextLine());
				
				p = bancoPessoa.getPessoaByCpf(cpf);
				int index = bancoPessoa.getIndex(p);
				
				
				System.out.println("- DADOS ATUAIS -");
				System.out.println("Nome:"+ p.getNome());
				System.out.println("Cpf:"+p.getCpf());
				System.out.println("Idade:"+p.getIdade());
				System.out.println("Telefone:"+p.getTelefone());
				
				
				System.out.println("- OQUE DESEJA ALTERAR? -");
				System.out.println("1-NOME");
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
					System.out.println("Digite o novo nome:");
					p.setNome(leitura.nextLine());

					bancoPessoa.getTabelaPessoas().set(index, p);
				}	
				break;
				case 2: {
					System.out.println("Digite o novo cpf:");
					p.setCpf(Long.valueOf(leitura.nextLine()));

					bancoPessoa.getTabelaPessoas().set(index, p);
				}	
				break;
				case 3: {
					System.out.println("Digite a idade:");
					p.setIdade(Integer.valueOf(leitura.nextLine()));

					bancoPessoa.getTabelaPessoas().set(index, p);
				}	
				break;
				case 4: {
					System.out.println("Digite o novo telefone:");
					p.setTelefone(Long.valueOf(leitura.nextLine()));

					bancoPessoa.getTabelaPessoas().set(index, p);
				}	
				break;
				}
			}
			break;
			
			
			case 3: {
				
				System.out.println("DIGITE O CPF DO DONO DO VEICULO:");
				long cpf = Long.valueOf(leitura.nextLine());
				
				p = bancoPessoa.getPessoaByCpf(cpf);
				int index = bancoPessoa.getIndex(p);
				
				
			
				if (veiculo.getTipo().equals("Carro"))		{		
					
					System.out.println("- DADOS DO VEICULO -");
				System.out.println("-"+ c.getTipo());
				System.out.println("MARCA:"+c.getMarca());
				System.out.println("MODELO:"+ c.getModelodocarro());
				System.out.println("PLACA:"+c.getPlaca());
				System.out.println("VALVULAS:"+c.getQuantvalvulas());
				System.out.println("COR:"+c.getCor());
				
					System.out.println("- OQUE DESEJA ALTERAR? -");
		
				System.out.println("1-MARCA:");
				System.out.println("2-MODELO:");
				System.out.println("3-PLACA:");
				System.out.println("4-VALVULAS:");
				System.out.println("5-COR:");
				
				System.out.println("\n 0-SAIR");
				opcaoSelecionada = Integer.valueOf(leitura.nextLine());
				
				switch (opcaoSelecionada) {
				case 0: {
					break;
				}
				case 1: {
					System.out.println("PARA QUAL MARCA DESEJA ALTERAR?");
					c.setMarca(leitura.nextLine());
	
					bancoVeiculo.getTabelaVeiculo().set(index, c);
				}	
				break;
				case 2: {
					System.out.println("PARA QUAL MODELO DESEJA ALTERAR?");
				c.setModelodocarro(leitura.nextLine());

					bancoVeiculo.getTabelaVeiculo().set(index, c);
				}	
				break;
				case 3: {
					System.out.println("PARA QUANTAS VALVULAS DESEJA ALTERAR?");
					c.setQuantvalvulas(Integer.valueOf(leitura.nextLine()));

					bancoVeiculo.getTabelaVeiculo().set(index, c);
				}	
				break;
				case 4: {
					System.out.println("PARA QUAL COR DESEJA ALTERAR?");
					c.setCor(leitura.nextLine());

					bancoVeiculo.getTabelaVeiculo().set(index, c);
				}	
				break;
				}
			}
			
			else  {					
				System.out.println("- DADOS DO VEICULO -");
			System.out.println("-"+ m.getTipo());
			System.out.println("MARCA:"+m.getMarca());
			System.out.println("MODELO:"+ m.getModelomoto());
			System.out.println("PLACA:"+m.getPlaca());
			System.out.println("VALVULAS:"+m.getQuantcelindradas());
			System.out.println("COR:"+m.getCor());
			
				System.out.println("- OQUE DESEJA ALTERAR? -");
	
			System.out.println("1-MARCA:");
			System.out.println("2-MODELO:");
			System.out.println("3-PLACA:");
			System.out.println("4-CELINDRADAS:");
			System.out.println("5-COR:");
			
			System.out.println("\n 0-SAIR");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());
			
			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				System.out.println("PARA QUAL MARCA DESEJA ALTERAR?");
				m.setMarca(leitura.nextLine());

				bancoVeiculo.getTabelaVeiculo().set(index, m);
			}	
			break;
			case 2: {
				System.out.println("PARA QUAL MODELO DESEJA ALTERAR?");
				c.setModelodocarro
				(leitura.nextLine());

				bancoVeiculo.getTabelaVeiculo().set(index, m);
			}	
			break;
			case 3: {
				System.out.println("PARA QUANTAS VALVULAS DESEJA ALTERAR?");
				p.getMoto().setQuantcelindradas(Integer.valueOf(leitura.nextLine()));

				bancoVeiculo.getTabelaVeiculo().set(index, m);
			}	
			break;
			case 4: {
				System.out.println("PARA QUAL COR DESEJA ALTERAR?");
				p.getMoto().setCor(leitura.nextLine());

				bancoVeiculo.getTabelaVeiculo().set(index, m);
			}	
			break;
			}
		}
				
			}
			break;
			
			
			case 4: {
				System.out.println("Digite o cpf da pessoa que deseja excluir:");
				Long cpf = Long.valueOf(leitura.nextLine());
				
				bancoPessoa.excluir(p, cpf);
				bancoVeiculo.excluir(veiculo,cpf);
			}
			break;
			case 5: {
				ArrayList<Pessoa> lista = bancoPessoa.listarPessoas();
				for (Pessoa pessoa  : lista  ) {
	
					System.out.println("Cpf: " + pessoa.getCpf());
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("Idade:"+ pessoa.getIdade());
					System.out.println("Telefone:"+ pessoa.getTelefone());

			}
			}
			break;
			case 6: {
				//ArrayList<Veiculo> listav =bancoVeiculo.listarVeiculos();
				ArrayList<Veiculo> lista = bancoVeiculo.listarVeiculos();
				for (Veiculo veiculo1 : lista  ) {

				//valor de ve sai como nulo	
		if (veiculo1.getTipo() == "Moto") {		
					System.out.println("-"+ m.getTipo());
					System.out.println("Marca:"+m.getMarca());
					System.out.println("Modelo:"+ m.getModelomoto());
					System.out.println("Placa:"+m.getPlaca());
					System.out.println("Valvulas:"+m.getQuantcelindradas());
					System.out.println("Cor:"+m.getCor());
		}
				
				//}
				else	{
					System.out.println("-"+ c.getTipo());
					System.out.println("Marca:"+c.getMarca());
					System.out.println("Modelo:"+ c.getModelodocarro());
					System.out.println("Placa:"+c.getPlaca());
					System.out.println("Valvulas:"+c.getQuantvalvulas());
					System.out.println("Cor:"+c.getCor());

				}
				if(p.getVagaAssociada() == null) {
					System.out.println("Vaga:Sem Vaga associada.");
					}
					else if (p.getVagaAssociada()!=null) {
					System.out.println("Sua vaga é:"+p.getVagaAssociada());
					}

				
				}
			}
			
			break;
			case 7: {
				System.out.println("**APÓS TER FEITO SEU CADASTRO DIGITE SEU CPF PARA QUE SEJA POSSIVEL RESERVARMOS UMA VAGA:**");
				System.out.println("DIGITE SEU CPF:");
				long cpf = Long.valueOf(leitura.nextLine());
				
				p = bancoPessoa.getPessoaByCpf(cpf);
				int index = bancoPessoa.getIndex(p);
				if(p!=null) { 
					System.out.println("**MUITO BEM!**");
					System.out.println("----VAGAS:----");
				System.out.println("1");
				System.out.println("2");
				System.out.println("3");
				System.out.println("4");
				System.out.println("5");
				System.out.println("6");
				System.out.println("7");
				System.out.println("8");
				System.out.println("9");
				System.out.println("10");
				Integer indexvaga = Integer.valueOf(leitura.nextLine());
			if (vaga.validaVaga(indexvaga) == true) {
			vaga.cadastrarVaga(indexvaga);
			p.setVagaAssociada(indexvaga);
			System.out.println("**MUITO BEM**");
			System.out.println("O número da sua vaga é:"+p.getVagaAssociada());
				
				 }else if (vaga.validaVaga(indexvaga) == false)
				 {
					 System.out.println("Desculpe, esta vaga está ocupada.");
					 System.out.println("Tente outra!");
				 }
				 else {
					 System.out.println("Desculpe, o sistema não reconhece o dado inserido.");
					 System.out.println("Tente outra vez!");
				 }
				
				}else if (p==null) {
					System.out.println("Cpf não cadastrado no sistema tente outro.");
				break;
				}
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