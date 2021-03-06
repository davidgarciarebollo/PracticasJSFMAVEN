package dtlazycoches.services;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import datatableconmybatis.domain.Student;
import datatableconmybatis.util.MyBatisSqlSessionFactory;
import dtlazycoches.domain.Coche;
import dtlazycoches.mappers.CocheMapper;

@ManagedBean
@ViewScoped
public class CocheService {

    public List<Coche> findAllCoches() throws IOException {
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            CocheMapper cocheMapper = sqlSession.getMapper(CocheMapper.class);
            return cocheMapper.findAllCoches();
        } finally {
            sqlSession.close();
        }
    }

    public Student findCocheById(Integer cocheid) throws IOException {
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            CocheMapper cocheMapper = sqlSession.getMapper(CocheMapper.class);
            return cocheMapper.findCocheById(cocheid);
        } finally {
            sqlSession.close();
        }
    }

    public void insertCoche(Coche coche) throws IOException {
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            CocheMapper cocheMapper = sqlSession.getMapper(CocheMapper.class);
            cocheMapper.insertCoche(coche);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public List<Coche> paginar(int first, int pageSize) throws IOException {

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            CocheMapper cocheMapper = sqlSession.getMapper(CocheMapper.class);
            return cocheMapper.paginar(first, pageSize);
        } finally {
            sqlSession.close();
        }

    }
}
