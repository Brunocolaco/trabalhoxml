package converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ConverterXml<T> {

	private Class<?> clazz[];

	public ConverterXml(Class<?>... clazz) {
		this.clazz = clazz;
	}

	public T deXmlParaObject(File xmlFile) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			T objeto = (T) unmarshaller.unmarshal(xmlFile);
			return objeto;
		} catch (JAXBException e) {
			throw new RuntimeException("Erro na hora de converter", e);
		}
	}

}
