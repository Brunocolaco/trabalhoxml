package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplina {

	@XmlAttribute(name = "nome")
	private String nome;

	@XmlElementWrapper(name = "notas")
	@XmlElement(name = "nota")
	private List<Nota> notas;

	private Double media;

	public void addNota(Nota nota) {
		if (nota == null) {
			notas = new ArrayList<>();
		}
		notas.add(nota);
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public String getNome() {
		return nome;
	}

	public Disciplina(String nome, List<Nota> notas) {
		super();
		this.nome = nome;
		this.notas = notas;
	}

	public Disciplina() {
		super();
	}

	public Double calculaMedias() {
		media = 0.0;	
		for (Nota n : notas) {
			media = media + n.getValor();
		}
		media = media / notas.size();
		return media;
	}

	
}
