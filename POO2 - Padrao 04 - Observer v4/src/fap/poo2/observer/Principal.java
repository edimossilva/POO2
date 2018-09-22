package fap.poo2.observer;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Antony", "programo em delphi de madrugada", new ArrayList<Curioso>(),
				new ArrayList<String>());
		Pessoa pessoa2 = new Pessoa("Natali", "escuto sorriso maroto de madrugada", new ArrayList<Curioso>(),
				new ArrayList<String>());
		Pessoa pessoa3 = new Pessoa("Gabriel", "Joga candy crush na fase 4000", new ArrayList<Curioso>(),
				new ArrayList<String>());
		pessoa.addCurioso(pessoa2);
		pessoa.addCurioso(pessoa3);
		
		pessoa3.addCurioso(pessoa2);
		
		pessoa.espalharSegredo();
		pessoa2.falarSegredosDosOutros();
		pessoa3.falarSegredosDosOutros();
		pessoa3.espalharSegredo();
		pessoa.falarSegredosDosOutros();
		pessoa2.falarSegredosDosOutros();
		
		
	}
}
