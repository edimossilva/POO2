package semmvc.logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import semmvc.modelo.Pessoa;

public class Principal {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public static void main(String[] args) {
		int opcaoEscolhida;
		while (true) {
			exibirOpcoesMenu();
			opcaoEscolhida = getNumeroDigitado();
			if (opcaoEscolhida == 1) {
				criarPessoa();
			} else if (opcaoEscolhida == 2) {
				listarPessoas();
			} else if (opcaoEscolhida == 3) {
				apagarPessoa();
			} else if (opcaoEscolhida == 4) {
				editarPessoa();
			} else if (opcaoEscolhida == 0) {
				break;
			}
		}

	}

	private static void editarPessoa() {
		Pessoa pessoaProcurada = encontrarPessoaPorNome();
		editarPessoa(pessoaProcurada);
	}

	private static void editarPessoa(Pessoa pessoaProcurada) {
		String novoNome = getString("Digite o novo nome da pessoa: ");
		LocalDate novaDataDeNascimento = getLocalDate("Digite a nova data de nascimento no formado dd/mm/yyyy: ");
		pessoaProcurada.setNome(novoNome);
		pessoaProcurada.setDataDeNascimento(novaDataDeNascimento);
	}

	private static void apagarPessoa() {
		Pessoa pessoaProcurada = encontrarPessoaPorNome();
		removerPessoa(pessoaProcurada);
	}

	private static Pessoa encontrarPessoaPorNome() {
		listarPessoas();
		String nome = getString("Digite o nome da pessoa: ");
		return getPessoa(nome);
	}

	private static void removerPessoa(Pessoa pessoaProcurada) {
		pessoas.remove(pessoaProcurada);
	}

	private static Pessoa getPessoa(String nome) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getNome().equals(nome)) {
				return pessoa;
			}
		}
		return null;
	}

	private static void listarPessoas() {
		pessoas.forEach(Pessoa::showInfo);
	}

	private static void criarPessoa() {
		String nome = getString("Digite o nome da pessoa: ");
		LocalDate dataDeNascimento = getLocalDate("Digite a data de nascimento no formado dd/mm/yyyy: ");

		Pessoa novaPessoa = new Pessoa(nome, dataDeNascimento);
		pessoas.add(novaPessoa);
	}

	private static LocalDate getLocalDate(String mensagem) {
		String dataDeNascimentoString = getString(mensagem);
		return converteStringParaData(dataDeNascimentoString);
	}

	private static String getString(String mensagem) {
		System.out.print(mensagem);
		return scanner.nextLine();
	}

	private static LocalDate converteStringParaData(String dataDeNascimentoString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(dataDeNascimentoString, formatter);
	}

	private static int getNumeroDigitado() {
		String numeroString = scanner.nextLine();
		return Integer.parseInt(numeroString);
	}

	private static void exibirOpcoesMenu() {
		System.out.println("MENU");
		System.out.println("0 - sair");
		System.out.println("1 - criar pessoa");
		System.out.println("2 - listar pessoas");
		System.out.println("3 - apagar pessoa");
		System.out.println("4 - editar pessoa");
	}
}
