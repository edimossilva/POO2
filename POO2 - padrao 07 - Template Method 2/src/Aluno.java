
public class Aluno {
	private String nome;

	public Aluno(String string) {
		setNome(string);
	}

	public void apresentaSuaParte() {
		System.out.println(getNome() + " apresentando trabalho");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
