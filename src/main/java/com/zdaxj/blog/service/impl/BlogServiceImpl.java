package com.zdaxj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zdaxj.blog.domain.Blog;
import com.zdaxj.blog.service.BlogService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【tbblog】的数据库操作Service实现
* @createDate 2022-05-02 17:06:48
*/
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog>
    implements BlogService{

}




