package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {

	@XmlAttribute(name = "nome")
	private String nome;

	@XmlElementWrapper(name = "disciplinas")
	@XmlElement(name = "disciplina")
	public List<Disciplina> disciplinas;

	private Double mediaGeral;

	public Aluno(String nome, List<Disciplina> disciplinas) {
		super();
		this.nome = nome;
		this.disciplinas = disciplinas;
	}

	public Aluno() {

	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void addDisciplina(Disciplina disciplina) {
		if (disciplina == null) {
			disciplinas = new ArrayList<>();
		}
		disciplinas.add(disciplina);
	}

	public Double calculaGeral() {
		mediaGeral = 0.0;
		for (Disciplina d : disciplinas) {
			mediaGeral = mediaGeral + d.calculaMedias();
		}
		mediaGeral = mediaGeral / disciplinas.size();
		return mediaGeral;
	}

}
