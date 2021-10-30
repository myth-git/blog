package com.sise.blog.service;

import com.sise.blog.pojo.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    /*获取数据库的全部标签*/
    List<Tag> listTag();
    /*获取一个一个标签*/
    List<Tag> listTag(String ids);
    /*获取标签*/
    List<Tag> listTagTop(Integer size);

    Tag updateTag(Long id, Tag tag);

    void deleteTag(Long id);
}
