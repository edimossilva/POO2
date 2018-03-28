package semlazyload;

import modelo.Bazuca;
import modelo.Metralhadora;
import modelo.Pistola;

public class Soldado {
	private Bazuca bazuca = new Bazuca();
	private Pistola pistola = new Pistola();
	private Metralhadora metralhadora = new Metralhadora();

	public void atirarComMetralhadora() {
		metralhadora.atirar();
	}

	public void atirarComPistola() {
		pistola.atirar();
	}

	public void atirarComBazuca() {
		bazuca.atirar();
	}
}
