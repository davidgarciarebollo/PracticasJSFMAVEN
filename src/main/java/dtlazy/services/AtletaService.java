package dtlazy.services;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import datatableconmybatis.domain.Student;
import datatableconmybatis.util.MyBatisSqlSessionFactory;
import dtlazy.domain.Atleta;
import dtlazy.mappers.AtletaMapper;

@ManagedBean
@ViewScoped
public class AtletaService {

	public List<Atleta> findAllAtletas() {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			AtletaMapper atletaMapper = sqlSession
					.getMapper(AtletaMapper.class);
			return atletaMapper.findAllAtletas();
		} finally {
			sqlSession.close();
		}
	}

	public Student findAtletaById(Integer atlId) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			AtletaMapper atletaMapper = sqlSession
					.getMapper(AtletaMapper.class);
			return atletaMapper.findAtletaById(atlId);
		} finally {
			sqlSession.close();
		}
	}

	public void insertAtleta(Atleta atleta) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			AtletaMapper atletaMapper = sqlSession
					.getMapper(AtletaMapper.class);
			atletaMapper.insertAtleta(atleta);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}
