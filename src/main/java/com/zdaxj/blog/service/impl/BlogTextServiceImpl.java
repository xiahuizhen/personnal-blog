package com.zdaxj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zdaxj.blog.dao.BlogTextMapper;
import com.zdaxj.blog.domain.BlogText;
import com.zdaxj.blog.service.BlogTextService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【tbblogtext】的数据库操作Service实现
* @createDate 2022-05-02 17:06:23
*/
@Service
public class BlogTextServiceImpl extends ServiceImpl<BlogTextMapper, BlogText>
    implements BlogTextService {

}




