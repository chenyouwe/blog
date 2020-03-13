package com.controller;

import com.entity.Article;
import com.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/article")
public class ArticleController extends {
    @Autowired
    ArticleService articleService;

    @DeleteMapping("/{id}")
    public Boolean delArticleService(@PathVariable Integer id) {
        return articleService.delArticleService(id);
    }

    @PostMapping
    public Boolean saveOrUpdateArticleService(@RequestBody Article article){
        return articleService.saveOrUpdateArticleService(article);
    }

    @GetMapping
    public List<Article> saveOrUpdateArticleService(@RequestParam Map params){
        return articleService.getPage(params);
    }

}
