package datatableconmybatis.util;

import java.io.IOException;
import org.apache.ibatis.session.*;

public class MyBatisSqlSessionFactory {
    protected static SqlSessionFactory sqlSessionFactory;

    protected MyBatisSqlSessionFactory() {
        super();

    }

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
    
        return null;
    }

    public static SqlSession openSession() throws IOException {
        return null;
    }
}