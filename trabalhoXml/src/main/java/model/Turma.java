package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Turma {

	@XmlElement(name = "aluno")
	private List<Aluno> alunos;

	public void addAluno(Aluno aluno) {
		if (alunos == null) {
			alunos = new ArrayList<>();
		}
		alunos.add(aluno);
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public Turma(List<Aluno> alunos) {
		super();
		this.alunos = alunos;
	}

	public Turma() {
		super();
	}

}
