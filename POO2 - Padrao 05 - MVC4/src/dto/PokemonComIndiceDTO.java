package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PokemonComIndiceDTO {
	private String nome;
	private String tipo;
	private int indice;
}
