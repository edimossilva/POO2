package mvc.visao;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mvc.controle.PessoaControle;

public class Principal {
	private Scanner scanner = new Scanner(System.in);
	private PessoaControle pessoaControle = new PessoaControle();

	public static void main(String[] args) {
		new Principal().iniciar();
	}

	public void iniciar() {
		int opcaoEscolhida;
		while (true) {
			//exibirOpcoesMenu();
			String message = "digite 1 para criar, digite 2 para listar";
			String resposta = JOptionPane.showInputDialog(message, null);
			
			opcaoEscolhida=Integer.parseInt(resposta);
			//opcaoEscolhida = getNumeroDigitado();
			if (opcaoEscolhida == 1) {
				criarPessoa();
			} else if (opcaoEscolhida == 2) {
				listarPessoas();
			} else if (opcaoEscolhida == 0) {
				break;
			}
		}

	}

	private void listarPessoas() {
		List<HashMap<String, String>> pessoasHashMap = pessoaControle.getPessoas();
		for (HashMap<String, String> hashMap : pessoasHashMap) {
			System.out.println(getPessoasInfo(hashMap));
		}
	}

	private String getPessoasInfo(HashMap<String, String> hashMap) {
		String nome = "Nome: " + hashMap.get("nome");
		String dataDeNascimento = "Data de Nascimento: " + hashMap.get("dataDeNascimento");
		return nome + ", " + dataDeNascimento;
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
		System.out.println("2 - listar pessoas");
	}
}
