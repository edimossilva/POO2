package modelo;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private String nome;
	private double valor;
	private List<Adicional> adicionais = new ArrayList<Adicional>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Item(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public List<Adicional> getAdicionais() {
		return adicionais;
	}

	public void addAdicional(Adicional adicional) {
		getAdicionais().add(adicional);
	}

}
