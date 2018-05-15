package game;

import java.awt.Color;
import java.awt.Graphics2D;

import core.Game;

// Esta é a classe que representa nosso jogo. Ela é derivada de "Game", que
// possui o motor do jogo e chama os métodos abaixo quando necessário.
public class JogoCirculo extends Game {

	// Variáveis necessárias para nosso jogo.
	// Elas armazenam a posição da bola (x,y) e a velocidade que ela anda.
	int x;
	int y;
	int sx;
	int sy;

	public void onLoad() {
		// Este método é chamado quando o jogo é iniciado.
		// Aqui damos os valores iniciais para as variáveis.
		x = 0;
		y = 0;
		sx = 1;
		sy = 1;
	}

	public void onUnload() {
		// Este método é chamado quando o jogo termina.
		// Não é preciso fazer nada para este jogo.
	}

	public void onUpdate() {
		// Este método é chamada cada vez que a lógica do jogo precisa ser
		// atualizada. Aqui mudamos os valores das variáveis para
		// fazer a bola se mover na tela, rebatendo nas bordas.
		x += sx;
		y += sy;
		// toda vez que a posição chega em um limite da tela,
		// a velocidade naquela direção é invertida.
		if (x < 0 || x > getWidth()) {
			sx *= -1;
		}
		if (y < 0 || y > getHeight()) {
			sy *= -1;
		}
	}

	public void onRender(Graphics2D g) {
		// Este método é chamado cada vez que é preciso atualizar a imagem
		// do jogo na tela. É aqui que desenyhamos abola na posição
		// armazenada nas variáveis.
		g.setColor(Color.white);
		g.drawOval(x, y, 10, 10);
	}
}
