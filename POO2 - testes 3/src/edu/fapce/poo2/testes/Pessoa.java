package edu.fapce.poo2.testes;

public class Pessoa {
	private String nome;
	private int saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void decrementa(int valor) {
		saldo = saldo - valor;
	}

	public void incrementa(int valor) {
		saldo = saldo + valor;
	}

	public void exibirSaldo() {
		System.out.println("Nome: " + getNome() + ", saldo atual: " + getSaldo());
	}

}
