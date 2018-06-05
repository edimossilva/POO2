package logica;

import mvc.visao.Visao;
import mvc.visao.VisaoConsole;
import mvc.visao.VisaoGUI;

public class Principal {
	public static void main(String[] args) {
		Visao visao = new VisaoGUI();
		visao.iniciar();
	}
}
