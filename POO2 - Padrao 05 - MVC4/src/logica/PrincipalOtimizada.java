package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Pokemon;

public class PrincipalOtimizada {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		List<Pokemon> pokemons = new ArrayList<Pokemon>();

		int opcao = 0;
		do {
			exibirMenu();
			opcao = getInt();

			if (opcao == 1) {
				criarPokemon(pokemons);
			} else if (opcao == 2) {
				exibirPokemons(pokemons);
			} else if (opcao == 3) {
				editarPokemon(pokemons);
			} else if (opcao == 4) {
				apagarPokemon(pokemons);
			}

		} while (opcao > 0 && opcao < 5);

	}

	private static void apagarPokemon(List<Pokemon> pokemons) {
		exibirPokemons(pokemons);
		int indice = getInt();
		pokemons.remove(indice);
	}

	private static void editarPokemon(List<Pokemon> pokemons) {
		exibirPokemons(pokemons);

		int indice = getInt();
		Pokemon pokemon = pokemons.get(indice);

		String nome = getString("digite o nome");
		String tipo = getString("digite o tipo");

		pokemon.setNome(nome);
		pokemon.setTipo(tipo);
	}

	private static void exibirPokemons(List<Pokemon> pokemons) {
		for (int i = 0; i < pokemons.size(); i++) {
			System.out.println(i + " = " + pokemons.get(i));
		}
	}

	private static void criarPokemon(List<Pokemon> pokemons) {
		String nome = getString("digite o nome");
		String tipo = getString("digite o tipo");

		Pokemon pokemon = new Pokemon(nome, tipo);
		pokemons.add(pokemon);
	}

	private static String getString(String string) {
		System.out.println(string);
		return s.nextLine();
	}

	private static int getInt() {
		int opcao = Integer.parseInt(s.nextLine());
		return opcao;
	}

	private static void exibirMenu() {
		System.out.println("Menu");
		System.out.println("1 - Cadastrar pokemon");
		System.out.println("2 - listar pokemons");
		System.out.println("3 - editar pokemon");
		System.out.println("4 - apagar pokemon");
		System.out.println("99 - sair");
	}
}
