package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	String nome;
	List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCursos(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obteCursoPorNome(String nome) {
		for (Curso curso : cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return nome;
	}
}
