package com.zdaxj.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zdaxj.blog.domain.Blog;
import com.zdaxj.blog.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangD
 * @since 2022/5/2
 */
@RestController
@AllArgsConstructor
@RequestMapping("/blog")
public class BlogController {

	private BlogService blogService;

	@RequestMapping("/page")
	public IPage<Blog> pageQuery(@RequestBody Blog blog, @RequestBody Page<Blog> page){
		return blogService.page(page,new QueryWrapper<Blog>().setEntity(blog));
	}
}
