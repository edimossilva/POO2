package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AtributosPokemonDTO {
	private String nome;
	private String tipo;
}
