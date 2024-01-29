package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.Article;

@Controller
public class UsrArticleController {

	private int lastArticleId = 0;
	private String title;
	private String body;
	private Article article;
	private List<Article> articles = new ArrayList<>();

	@RequestMapping("/usr/home/doModify")
	@ResponseBody
	public Object doModify(int id) {
		if (articles.get(id - 1).getId() == id) {
			String title = "안녕";
			String body = "하세요";
			articles.get(id - 1).setTitle(title);
			articles.get(id - 1).setBody(body);
			return id + "번 글이 수정되었습니다.";
		}
		return id + "번 글은 없습니다.";

	}

	@RequestMapping("/usr/home/doDelete")
	@ResponseBody
	public Object doDelete(int id) {
		if (articles.get(id - 1).getId() == id - 1) {
			articles.remove(id - 1);
			return id + "번 글이 삭제되었습니다.";
		}
		return id + "번 글은 없습니다.";
	}

	public UsrArticleController() {
		lastArticleId = 0;
		articles = new ArrayList<>();

		makeTestData();
	}

	private void makeTestData() {
		for (int i = 1; i <= 10; i++) {
			String title = "제목" + i;
			String body = "내용" + i;

			writeArticle(title, body);
		}
	}

	public Article writeArticle(String title, String body) {
		int id = lastArticleId + 1;
		Article article = new Article(id, title, body);
		articles.add(article);
		lastArticleId++;

		return article;
	}

	@RequestMapping("/usr/home/getArticles")
	@ResponseBody
	public List<Article> getArticles() {

		return articles;
	}

	@RequestMapping("/usr/home/doAdd")
	@ResponseBody
	public String doAdd(String title, String body) {
		int id = lastArticleId + 1;
		Article article = new Article(id, title, body);
		articles.add(article);
		lastArticleId++;
		return id + "번 글이 등록되었습니다.";
	}

}
