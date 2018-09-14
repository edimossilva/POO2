package fap.poo2.leitormaratona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import fap.poo2.leitormaratona.logica.Conversor;
import fap.poo2.leitormaratona.logica.LeitorDeArquivo;
import fap.poo2.leitormaratona.logica.Relatorio;
import fap.poo2.leitormaratona.modelo.Participante;

public class Principal {
	public static void main(String[] args) {

		LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();
		Conversor conversor = new Conversor();

		List<String> linhasCoaches = leitorDeArquivo.ler("csv/coaches.csv");
		List<Participante> coaches = conversor.linhasToParticipantes(linhasCoaches, "coach");

		List<String> linhasCoCoaches = leitorDeArquivo.ler("csv/cocoaches.csv");
		List<Participante> coCoaches = conversor.linhasToParticipantes(linhasCoCoaches, "cocoach");

		List<String> linhasContestants = leitorDeArquivo.ler("csv/contestants.csv");
		List<Participante> contestants = conversor.linhasToParticipantes(linhasContestants, "contestant");

		List<String> linhasReserves = leitorDeArquivo.ler("csv/reserves.csv");
		List<Participante> reserves = conversor.linhasToParticipantes(linhasReserves, "reserve");
		
		List<Participante> todos = new ArrayList<Participante>();
		todos.addAll(coaches);
		todos.addAll(coCoaches);
		todos.addAll(contestants);
		todos.addAll(reserves);
		
		Relatorio relatorio = new Relatorio(todos);
		relatorio.exibirEquipesComIntegrantes();
		
	}
}
