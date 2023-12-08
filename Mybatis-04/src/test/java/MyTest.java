import org.apache.ibatis.session.SqlSession;
import org.example.dao.BlogMapper;
import org.example.pojo.Blog;
import org.example.utils.IUtils;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addInitBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();

        blog.setId(IUtils.genId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("功夫河粉");
        blog.setCreateTime(new Date());
        blog.setViews(998);
        mapper.addBlog(blog);

        blog.setId(IUtils.genId());
        blog.setTitle("Java如此困难");
        blog.setCreateTime(new Date());
        blog.setViews(998);
        mapper.addBlog(blog);

        blog.setId(IUtils.genId());
        blog.setTitle("Spring如此困难");
        blog.setCreateTime(new Date());
        blog.setViews(998);
        mapper.addBlog(blog);

        blog.setId(IUtils.genId());
        blog.setTitle("微服务如此困难");
        blog.setCreateTime(new Date());
        blog.setViews(998);
        mapper.addBlog(blog);

        session.close();
    }

    @Test
    public void IFTest(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title","java如此困难");
        map.put("author","功夫河粉");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for(Blog blog : blogs){
            System.out.println(blog);
        }

        session.close();
    }

    @Test
    public void foreachTest(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids", ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);
        for(Blog blog : blogs){
            System.out.println(blog);
        }

        session.close();
    }

    @Test
    public void chooseTest(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title","java如此困难");
        map.put("author","功夫河粉");
        map.put("views",998);

        List<Blog> blogs = mapper.queryBlogChoose(map);
        for(Blog blog : blogs){
            System.out.println(blog);
        }

        session.close();
    }

    @Test
    public void updateBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title","MybatisPlus如此困难");
        map.put("id","3690");

        mapper.updateBlog(map);

        session.close();
    }
}