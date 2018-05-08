package mvc.visao;

import java.util.HashMap;
import java.util.Scanner;

import mvc.controle.PessoaControle;

public class Principal {
	private Scanner scanner = new Scanner(System.in);
	private PessoaControle pessoaControle = new PessoaControle();

	public void iniciar() {
		int opcaoEscolhida;
		while (true) {
			exibirOpcoesMenu();
			opcaoEscolhida = getNumeroDigitado();
			if (opcaoEscolhida == 1) {
				criarPessoa();
			} else if (opcaoEscolhida == 0) {
				break;
			}
		}

	}

	private void criarPessoa() {
		HashMap<String, String> pessoaDTO = new HashMap<String, String>();
		String nome = getString("Digite o nome da pessoa: ");
		String dataDeNascimento = getString("Digite a data de nascimento no formado dd/mm/yyyy: ");
		pessoaDTO.put("nome", nome);
		pessoaDTO.put("dataDeNascimento", dataDeNascimento);
		pessoaControle.save(pessoaDTO);
		
	}

	private String getString(String mensagem) {
		System.out.print(mensagem);
		return scanner.nextLine();
	}

	private int getNumeroDigitado() {
		String numeroString = scanner.nextLine();
		return Integer.parseInt(numeroString);
	}

	private void exibirOpcoesMenu() {
		System.out.println("MENU");
		System.out.println("0 - sair");
		System.out.println("1 - criar pessoa");
	}
}
