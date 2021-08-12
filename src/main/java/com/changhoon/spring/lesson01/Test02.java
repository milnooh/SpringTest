package com.changhoon.spring.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/test02")
public class Test02 {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> movies() {
		List<Map<String, Object>> movies = new ArrayList<>();
		Map<String, Object> movie1 = new HashMap<>();
		movie1.put("rata", 15);
		movie1.put("director", "봉준호");
		movie1.put("time", 131);
		movie1.put("title", "기생충");
		movies.add(movie1);
		
		Map<String, Object> movie2 = new HashMap<>();
		movie2.put("rata", 0);
		movie2.put("director", "로베르토 베니니");
		movie2.put("time", 116);
		movie2.put("title", "인생은 아름다워");
		movies.add(movie2);
		
		Map<String, Object> movie3 = new HashMap<>();
		movie3.put("rata", 12);
		movie3.put("director", "크리스토의 놀란");
		movie3.put("time", 147);
		movie3.put("title", "인셉션");
		movies.add(movie3);
		
		Map<String, Object> movie4 = new HashMap<>();
		movie4.put("rata", 19);
		movie4.put("director", "윤종빈");
		movie4.put("time", 133);
		movie4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movies.add(movie4);
		
		Map<String, Object> movie5 = new HashMap<>();
		movie5.put("rata", 15);
		movie5.put("director", "프린시스 로랜스");
		movie5.put("time", 137);
		movie5.put("title", "헝거게임");
		movies.add(movie5);
		
		return movies;
	}
	
	@RequestMapping("/2")
	public List<Post> posts() {
		
		List<Post> posts = new ArrayList<>();
		
		Post post = new Post();
		post.setTitle("안녕하세요");
		post.setUser("hagulu");
		post.setContent("안녕하세요. 가입했어요. 활동 열심히 하겠습니다.");
		posts.add(post);
		
		post = new Post();
		post.setTitle("헐 대박");
		post.setUser("bada");
		post.setContent("오늘 목요일 이였어... 금요일인줄");
		posts.add(post);
		
		post = new Post();
		post.setTitle("오늘 데이트 한 이야기 해드릴게요");
		post.setUser("hdulumary");
		post.setContent("....");
		posts.add(post);
		//post.add(new Post("안녕하세요", "hagulu", "안녕하세요. 가입했어요. 활동 열심히 하겠습니다."));
		//post.add(new Post("헐 대박", "bada", "오늘 목요일 이였어... 금요일인줄"));
		//post.add(new Post("오늘 데이트 한 이야기 해드릴게요", "hdulumary", "...."));
		
		return posts;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Post> entity() {
		Post post = new Post();
		post.setTitle("안녕하세요");
		post.setUser("hagulu");
		post.setContent("안녕하세요. 가입했어요. 활동 열심히 하겠습니다.");
		
		ResponseEntity<Post> entity = new ResponseEntity<>(post, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
	
}
