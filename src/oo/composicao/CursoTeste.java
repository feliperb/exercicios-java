package oo.composicao;

//Muitos pra muitos
public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Igreja");
		Curso c3 = new Curso("Filosofia");
		
		c1.adicionarALuno(a1);
		c1.adicionarALuno(a2);
		
		c2.adicionarALuno(a1);			//A1 esta no c1,c2,c3
		c2.adicionarALuno(a3);			//A2 esta no c1
										//A3 esta no c2,c3
		a1.adicionarCursos(c3);
		a2.adicionarCursos(c3);
		a3.adicionarCursos(c3);
		
		for (Aluno aluno : c1.alunos) {
			System.out.println("Estou matriculado no curso: "+ c1.nome +"...");
			System.out.println("...e o meu nome eh " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(a1.cursos.get(0).alunos.toString());
		
		Curso encontrado = a1.obteCursoPorNome("Java");
		
		if(encontrado != null) {
			System.out.println(encontrado.nome);
			System.out.println(encontrado.alunos);
		}
	}
}
