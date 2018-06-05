package mvc.controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mvc.modelo.Pessoa;

public class PessoaParser {

	public Pessoa hashmapToPessoa(HashMap<String, String> pessoaDTO) {
		String nome = pessoaDTO.get("nome");
		String dataDeNascimentoString = pessoaDTO.get("dataDeNascimento");
		LocalDate dataDeNascimento = converteStringParaData(dataDeNascimentoString);

		return new Pessoa(nome, dataDeNascimento);

	}
	public List<HashMap<String, String>> pessoasToHashMap(List<Pessoa> pessoas) {
		List<HashMap<String, String>> pessoasHashMap = new ArrayList();
		for (Pessoa pessoa : pessoas) {
			pessoasHashMap.add(pessoaToHashMap(pessoa));
		}
		return pessoasHashMap;
	}

	private HashMap<String, String> pessoaToHashMap(Pessoa pessoa) {
		HashMap<String, String> pessoaHashMap = new HashMap();
		pessoaHashMap.put("nome", pessoa.getNome());
		pessoaHashMap.put("dataDeNascimento", pessoa.getDataDeNascimento().toString());

		return pessoaHashMap;
	}
	private LocalDate converteStringParaData(String dataDeNascimentoString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(dataDeNascimentoString, formatter);
	}
}
