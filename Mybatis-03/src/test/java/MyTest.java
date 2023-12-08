import org.apache.ibatis.session.SqlSession;
import org.example.dao.TeacherMapper;
import org.example.pojo.Teacher;
import org.example.utils.MybatisUtils;
import org.junit.Test;

public class MyTest {
    @Test
    public void FTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}