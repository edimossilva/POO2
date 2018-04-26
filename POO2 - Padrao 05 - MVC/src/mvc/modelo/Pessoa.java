package mvc.modelo;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate dataDeNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Pessoa(String nome, LocalDate dataDeNascimento) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getInfo() {
		String info = "Nome: " + getNome() + ", " + "data de nascimento: " + getDataDeNascimento();
		return info;
	}

}
