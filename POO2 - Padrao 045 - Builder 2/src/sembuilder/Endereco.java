package sembuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Endereco {
	public Endereco(String bairro2, String rua2) {
		setBairro(bairro2);
		setRua(rua2);
	}

	public Endereco(String bairro2, String rua2, String complemento2) {
		setBairro(bairro2);
		setRua(rua2);
		setComplemento(complemento2);
	}

	private String rua, bairro, cidade, complemento;
	private int numero, cep;
}
