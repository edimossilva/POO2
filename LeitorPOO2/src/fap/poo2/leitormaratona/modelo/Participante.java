package fap.poo2.leitormaratona.modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Participante {
	private String nome, tamanhoCamisa, instituicao, time, cargo;

	public String getInfoEquipe() {
		return getNome() + " (" + getCargo() + ")";
	}
}
