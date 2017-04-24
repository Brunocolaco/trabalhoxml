package main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Aluno;
import model.Disciplina;
import model.Nota;
import model.Turma;

public class Main {

	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(Turma.class, Aluno.class, Disciplina.class, Nota.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Turma turma = (Turma) unmarshaller.unmarshal(new File("boletimTurma.xml"));

		for (Aluno a : turma.getAlunos()) {
			System.out.println("Nome: " + a.getNome() + ", Média Geral: " + a.calculaGeral());

			for (Disciplina d : a.getDisciplinas()) {
				System.out.println("Disciplina: " + d.getNome() + ", Média Disciplina: " + d.calculaMedias());

				for (Nota n : d.getNotas()) {
					System.out.println("Nota: " + n.getValor());
				}
			}
		}

	}

}
