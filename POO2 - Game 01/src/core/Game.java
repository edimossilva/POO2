package core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

abstract public class Game implements WindowListener {

	private JFrame mainWindow;
	private boolean active;
	private BufferStrategy bufferStrategy;

	public Game() {
		mainWindow = new JFrame("Titulo do jogo");
		mainWindow.setSize(800, 600);
		mainWindow.addWindowListener(this);
		active = false;
	}

	public void terminate() {
		active = false;
	}

	public void run() {
		active = true;
		load();
		while (active) {
			update();
			render();
		}
		unload();
	}

	public void load() {
		mainWindow.setIgnoreRepaint(true);
		mainWindow.setLocation(100, 100);
		mainWindow.setVisible(true);
		mainWindow.createBufferStrategy(2);
		bufferStrategy = mainWindow.getBufferStrategy();
		onLoad();
	}

	public void unload() {
		onUnload();
		bufferStrategy.dispose();
		mainWindow.dispose();
	}

	public void update() {
		onUpdate();
		Thread.yield();
	}

	public void render() {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, mainWindow.getWidth(), mainWindow.getHeight());
		onRender(g);
		g.dispose();
		bufferStrategy.show();
	}

	// Método que deverá ser implementado nas classes derivadas desta.
	abstract public void onLoad();

	// Método que deverá ser implementado nas classes derivadas desta.
	abstract public void onUnload();

	// Método que deverá ser implementado nas classes derivadas desta.
	abstract public void onUpdate();

	// Método que deverá ser implementado nas classes derivadas desta.
	abstract public void onRender(Graphics2D g);

	public int getWidth() {
		// Retorna a largura da janela.
		return mainWindow.getWidth();
	}

	public int getHeight() {
		// Retorna a altura da janela.
		return mainWindow.getHeight();
	}

	public void windowClosing(WindowEvent e) {
		// Método chamado no evento de fechar a janela.
		// Nese momento chamamos terminate para terminar o jogo.
		terminate();
	}

	// Método que precisa ser implementado porque implementamos
	// a interface WindowListener, que contem ele.
	// Nesse caso, não precisamos nenhum código dentro dele.
	public void windowOpened(WindowEvent e) {
	}

	// Método que precisa ser implementado porque implementamos
	// a interface WindowListener, que contem ele.
	// Nesse caso, não precisamos nenhum código dentro dele.
	public void windowClosed(WindowEvent e) {
	}

	// Método que precisa ser implementado porque implementamos
	// a interface WindowListener, que contem ele.
	// Nesse caso, não precisamos nenhum código dentro dele.
	public void windowIconified(WindowEvent e) {
	}

	// Método que precisa ser implementado porque implementamos
	// a interface WindowListener, que contem ele.
	// Nesse caso, não precisamos nenhum código dentro dele.
	public void windowDeiconified(WindowEvent e) {
	}

	// Método que precisa ser implementado porque implementamos
	// a interface WindowListener, que contem ele.
	// Nesse caso, não precisamos nenhum código dentro dele.
	public void windowActivated(WindowEvent e) {
	}

	// Método que precisa ser implementado porque implementamos
	// a interface WindowListener, que contem ele.
	// Nesse caso, não precisamos nenhum código dentro dele.
	public void windowDeactivated(WindowEvent e) {
	}
}