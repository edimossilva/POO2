package visao;

import java.util.List;
import java.util.Scanner;

import controle.PokemonControle;
import dto.AtributosPokemonDTO;
import dto.PokemonComIndiceDTO;

public class PokemonVisao {
	private static Scanner s = new Scanner(System.in);
	private PokemonControle pokemonControle = new PokemonControle();

	public void executar() {
		int opcao = 0;
		do {
			exibirMenu();
			opcao = getInt();

			if (opcao == 1) {
				String nome = getString("digite o nome");
				String tipo = getString("digite o tipo");
				AtributosPokemonDTO dto = AtributosPokemonDTO.builder().nome(nome).tipo(tipo).build();
				pokemonControle.criarPokemon(dto);
			} else if (opcao == 2) {
				exibirPokemons();
			} else if (opcao == 3) {
				exibirPokemons();
				int indice = getInt();
				String nome = getString("digite o nome");
				String tipo = getString("digite o tipo");
				PokemonComIndiceDTO dto = PokemonComIndiceDTO.builder().nome(nome).tipo(tipo).indice(indice).build();
				pokemonControle.editarPokemon(dto);
			} else if (opcao == 4) {
				exibirPokemons();
				int indice = getInt();

				pokemonControle.apagarPokemon(indice);
			}

		} while (opcao > 0 && opcao < 5);

	}

	public void exibirMenu() {
		System.out.println("Menu");
		System.out.println("1 - Cadastrar pokemon");
		System.out.println("2 - listar pokemons");
		System.out.println("3 - editar pokemon");
		System.out.println("4 - apagar pokemon");
		System.out.println("99 - sair");
	}

	private void exibirPokemons() {
		List<String> pokemons = pokemonControle.getPokemons();
		pokemons.forEach(System.out::println);
	}

	private static int getInt() {
		int opcao;
		opcao = Integer.parseInt(s.nextLine());
		return opcao;
	}

	private static String getString(String string) {
		System.out.println(string);
		return s.nextLine();
	}

}
