package mvc.controle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mcv.servico.PessoaParser;
import mvc.modelo.Pessoa;

public class PessoaControle {
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private PessoaParser pessoaParser = new PessoaParser();

	public void save(HashMap<String, String> pessoaDTO) {
		Pessoa novaPessoa = pessoaParser.hashmapToPessoa(pessoaDTO);
		pessoas.add(novaPessoa);
	}

	public List<HashMap<String, String>> getPessoas() {
		List<HashMap<String, String>> pessoasHashMap = pessoaParser.pessoasToHashMap(pessoas);
		return pessoasHashMap;
	}

}
