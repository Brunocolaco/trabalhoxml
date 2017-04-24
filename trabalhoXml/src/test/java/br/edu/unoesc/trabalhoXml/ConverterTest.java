package br.edu.unoesc.trabalhoXml;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;

import converter.AlunoConverter;
import model.Turma;

public class ConverterTest {
	@Test
	public void deveConverter() {
		AlunoConverter converter = new AlunoConverter();
		Turma aluno = converter.toObject(new File("boletimTurma.xml"));
		assertNotNull(aluno);

	}

}
