package fap.poo2.observer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pessoa implements Curioso {
	private String nome;
	private String segredo;
	private List<Curioso> curiosos;
	private List<String> segredos;

	public void addCurioso(Curioso curioso) {
		curiosos.add(curioso);
	}

	public void espalharSegredo() {
		for (Curioso curioso : curiosos) {
			curioso.ouvirSegredo(segredo);
		}
	}

	public void falarSegredosDosOutros() {
		System.out.println(getNome());
		for (String segredo : segredos) {
			System.out.println(segredo);
		}
	}

	@Override
	public void ouvirSegredo(String segredo) {
		segredos.add(segredo);
	}
}
