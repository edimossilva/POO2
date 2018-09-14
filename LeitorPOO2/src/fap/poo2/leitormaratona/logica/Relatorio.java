package fap.poo2.leitormaratona.logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import fap.poo2.leitormaratona.modelo.Participante;

public class Relatorio {
	private List<Participante> todos;

	public Relatorio(List<Participante> todos) {
		this.todos = todos;
	}

	public void exibirEquipesComIntegrantes() {
		HashSet<String> times = new HashSet<String>();
		for (Participante participante : todos) {
			times.add(participante.getTime());
		}
		HashMap<String, List<Participante>> hashMap = new HashMap<String, List<Participante>>();
		for (String string : times) {
			hashMap.put(string, new ArrayList<Participante>());
		}
		for (Participante participante : todos) {
			hashMap.get(participante.getTime()).add(participante);
		}
		exibirInformacoesHashMap(hashMap, times);
	}

	private void exibirInformacoesHashMap(HashMap<String, List<Participante>> hashMap, HashSet<String> times) {
		for (String time : times) {
			List<Participante> equipe = hashMap.get(time);
			exibirEquipe(equipe);
		}
	}

	private void exibirEquipe(List<Participante> equipe) {
		System.out.println();
		System.out.println(equipe.get(0).getTime() + ", " + equipe.get(0).getInstituicao());
		for (Participante participante : equipe) {
			System.out.println(participante.getInfoEquipe());
		}
	}

}
