package converter;

import java.io.File;

import model.Aluno;
import model.Disciplina;
import model.Nota;
import model.Turma;

public class AlunoConverter {

	private ConverterXml<Turma> converterXml = new ConverterXml<>(Turma.class, Aluno.class, Disciplina.class, Nota.class);

	public Turma toObject(File XMLFile) {
		return converterXml.deXmlParaObject(XMLFile);

	}

}
