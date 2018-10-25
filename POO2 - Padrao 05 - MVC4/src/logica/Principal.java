package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Pokemon;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		List<Pokemon> pokemons = new ArrayList<Pokemon>();
		System.out.println("Menu");
		System.out.println("1 - Cadastrar pokemon");
		System.out.println("2 - listar pokemons");
		System.out.println("3 - editar pokemon");
		System.out.println("4 - apagar pokemon");
		System.out.println("99 - sair");

		int opcao = s.nextInt();
		s.nextLine();
		while (opcao > 0 && opcao < 5) {
			if (opcao == 1) {
				System.out.println("digite o nome");
				String nome = s.nextLine();
				System.out.println("digite o tipo");
				String tipo = s.nextLine();
				Pokemon pokemon = new Pokemon(nome, tipo);
				pokemons.add(pokemon);
			} else if (opcao == 2) {
				for (Pokemon pokemon : pokemons) {
					System.out.println(pokemon);
				}
			} else if (opcao == 3) {
				for (int i = 0; i < pokemons.size(); i++) {
					System.out.println(i + " = " + pokemons.get(i));
				}
				int indice = s.nextInt();
				s.nextLine();
				Pokemon pokemon = pokemons.get(indice);

				System.out.println("digite o nome");
				String nome = s.nextLine();
				System.out.println("digite o tipo");
				String tipo = s.nextLine();
				pokemon.setNome(nome);
				pokemon.setTipo(tipo);
			} else if (opcao == 4) {
				for (int i = 0; i < pokemons.size(); i++) {
					System.out.println(i + " = " + pokemons.get(i));
				}
				int indice = s.nextInt();
				s.nextLine();
				pokemons.remove(indice);
			}
			System.out.println("Menu");
			System.out.println("1 - Cadastrar pokemon");
			System.out.println("2 - listar pokemons");
			System.out.println("3 - editar pokemon");
			System.out.println("4 - apagar pokemon");
			System.out.println("99 - sair");

			opcao = s.nextInt();
			s.nextLine();

		}

	}
}
