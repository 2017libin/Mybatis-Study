package org.example.dao;

import org.example.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    // 新增一个博客
    void addBlog(Blog blog);

    // 查询博客
    List<Blog> queryBlogIF(Map map);

    // 选择查询
    List<Blog> queryBlogChoose(Map map);

    // 选择查询
    List<Blog> queryBlogForeach(Map map);

    // 修改博客
    int updateBlog(Map map);
}