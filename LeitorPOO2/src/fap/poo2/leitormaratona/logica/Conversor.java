package fap.poo2.leitormaratona.logica;

import java.util.ArrayList;
import java.util.List;

import fap.poo2.leitormaratona.modelo.Participante;

public class Conversor {
	private Participante linhaToParticipante(String linha, String cargo) {
		Participante participante = new Participante();

		participante.setNome(getNome(linha));
		participante.setTamanhoCamisa(getTamanhoCamisa(linha));
		participante.setInstituicao(getInstituicao(linha));
		participante.setTime(getTime(linha));
		participante.setCargo(cargo);

		return participante;
	}

	public List<Participante> linhasToParticipantes(List<String> listaDeLinhas, String cargo) {
		List<Participante> participantes = new ArrayList<Participante>();
		for (String linha : listaDeLinhas) {
			participantes.add(linhaToParticipante(linha, cargo));
		}
		return participantes;
	}

	private String getNome(String linha) {
		return getCampoDaLinha(linha, 0);
	}

	private String getTamanhoCamisa(String linha) {
		return getCampoDaLinha(linha, 1);
	}

	private String getInstituicao(String linha) {
		return getCampoDaLinha(linha, 2);
	}

	private String getTime(String linha) {
		return getCampoDaLinha(linha, 3);
	}

	private String getCampoDaLinha(String linha, int index) {
		String campoComAspas = linha.split(",")[index];
		String campoSemAspas = campoComAspas.replace("\"", "");
		return campoSemAspas;
	}

}
