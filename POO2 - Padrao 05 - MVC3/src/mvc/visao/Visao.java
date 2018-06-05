package mvc.visao;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import mvc.controle.PessoaControle;

public abstract class Visao {
	protected Scanner scanner = new Scanner(System.in);
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
			}else if (opcaoEscolhida == 2) {
				listarPessoas();
			}
		}

	}
	private void listarPessoas() {
		List<HashMap<String, String>> pessoasHashMap = pessoaControle.getPessoas();
		for (HashMap<String, String> hashMap : pessoasHashMap) {
			exibir(getPessoasInfo(hashMap));
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
	protected abstract void exibir(String mensagem);
	
	protected abstract String getString(String mensagem);

	protected abstract int getNumeroDigitado();

	protected abstract void exibirOpcoesMenu();
}
