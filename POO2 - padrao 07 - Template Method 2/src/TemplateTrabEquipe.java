import java.util.List;

public abstract class TemplateTrabEquipe {

	public void fazerTrabalho(List<Aluno> alunos) {
		escolherTema();
		montarEquipes();
		apresentar(alunos);
	}

	private void apresentar(List<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			aluno.apresentaSuaParte();
		}
	}

	public abstract void montarEquipes();

	public abstract void escolherTema();
}
