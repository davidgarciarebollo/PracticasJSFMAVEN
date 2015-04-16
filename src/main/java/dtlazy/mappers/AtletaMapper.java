package dtlazy.mappers;

import java.util.List;

import datatableconmybatis.domain.Student;
import dtlazy.domain.Atleta;

public interface AtletaMapper {
	List<Atleta> findAllAtletas();

	Student findAtletaById(Integer id);

	void insertAtleta(Atleta atleta);
}
