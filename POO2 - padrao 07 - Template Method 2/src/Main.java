import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Natali"));
		alunos.add(new Aluno("Bruno"));
		List<TemplateTrabEquipe> lista = new ArrayList<TemplateTrabEquipe>();
		TemplateTrabEquipe edi = new TrabalhoTioEdi();
		TemplateTrabEquipe tata = new TrabalhoTioTaddeo();
		lista.add(edi);
		lista.add(tata);
		for (TemplateTrabEquipe trab : lista) {
			System.out.println("-------");
			trab.fazerTrabalho(alunos);
		}
	}
}
