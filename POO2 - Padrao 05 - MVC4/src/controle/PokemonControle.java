package controle;

import java.util.ArrayList;
import java.util.List;

import dto.AtributosPokemonDTO;
import dto.PokemonComIndiceDTO;
import modelo.Pokemon;

public class PokemonControle {
	List<Pokemon> pokemons = new ArrayList<Pokemon>();

	public void criarPokemon(AtributosPokemonDTO dto) {
		Pokemon pokemon = new Pokemon(dto.getNome(), dto.getTipo());
		pokemons.add(pokemon);
	}

	public List<String> getPokemons() {
		List<String> pokemonsString = new ArrayList<String>();
		for (Pokemon pokemon : pokemons) {
			pokemonsString.add(pokemon.toString());
		}

		return pokemonsString;
	}

	public void editarPokemon(PokemonComIndiceDTO dto) {
		Pokemon pokemon = pokemons.get(dto.getIndice());

		pokemon.setNome(dto.getNome());
		pokemon.setTipo(dto.getTipo());
	}

	public void apagarPokemon(int indice) {
		pokemons.remove(indice);
	}

}
