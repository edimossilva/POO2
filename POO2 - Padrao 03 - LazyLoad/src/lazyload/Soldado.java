package lazyload;

import modelo.Bazuca;
import modelo.Metralhadora;
import modelo.Pistola;

public class Soldado {
	private Bazuca bazuca;
	private Pistola pistola;
	private Metralhadora metralhadora;

	public void atirarComMetralhadora() {
		if (metralhadora == null) {
			metralhadora = new Metralhadora();
		}
		metralhadora.atirar();
	}

	public void atirarComPistola() {
		if (pistola == null) {
			pistola = new Pistola();
		}
		pistola.atirar();
	}

	public void atirarComBazuca() {
		if (bazuca == null) {
			bazuca = new Bazuca();
		}
		bazuca.atirar();
	}
}
