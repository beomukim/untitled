package com.untitled.post.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.untitled.post.model.Post;

@Repository
public interface PostDAO {
	public List<Post> selectPostList(
			@Param("search") String search, 
			@Param("sort") String sort);

	public int insertPost(
			@Param("userId") int userId,
			@Param("title") String title, 
			@Param("content") String content, 
			@Param("price") String price, 
			@Param("imagePath") String imagePath);
}
