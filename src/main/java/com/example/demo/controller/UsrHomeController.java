package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.Article;

@Controller
public class UsrHomeController {

	private int id;
	private String title;
	private String body;
	private Article article;
	private List<Article> articles = new ArrayList<>();

}
