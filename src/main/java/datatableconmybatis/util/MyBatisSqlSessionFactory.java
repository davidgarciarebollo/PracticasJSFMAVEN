package datatableconmybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class MyBatisSqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory;

    private MyBatisSqlSessionFactory() {
        super();

    }

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        if (sqlSessionFactory == null) {
            InputStream inputStream;
           
                inputStream = Resources
                        .getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder()
                        .build(inputStream);
            
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSession() throws IOException {
        return getSqlSessionFactory().openSession();
    }
}