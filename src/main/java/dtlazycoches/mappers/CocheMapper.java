package dtlazycoches.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.*;

import datatableconmybatis.domain.Student;
import dtlazycoches.domain.Coche;

public interface CocheMapper {

    List<Coche> findAllCoches();

    Student findCocheById(Integer id);

    void insertCoche(Coche coche);

    List<Coche> paginar(@Param("first") int first,
            @Param("pageSize") int pageSize);
}
