package com.sise.blog.service;

import com.sise.blog.pojo.Comment;

import java.util.List;

public interface CommentService {
    //获取评论列表
    List<Comment> listCommentByBlogId(Long blogId);
    //保存评论信息
    Comment saveComment(Comment comment);
}
