package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Nota {

	@XmlAttribute(name = "valor")
	private Double valor;

	public Nota() {
	}

	public Double getValor() {
		return valor;
	}

	public Nota(Double valor) {
		super();
		this.valor = valor;
	}

}
