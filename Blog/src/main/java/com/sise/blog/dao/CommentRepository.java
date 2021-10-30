package com.sise.blog.dao;

import com.sise.blog.pojo.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    //获取父级根节点
    List<Comment> findByBlogIdAndAndParentCommentNull(Long blogId, Sort sort);
}
