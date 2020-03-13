package com.service;

import com.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void testUpd() {
        Article article = new Article(1);
        article.setTitle("testadd");
        article.setState(1);
        articleService.saveOrUpdateArticleService(article);
    }

    @Test
    public void testDel(){
        articleService.delArticleService(1);
    }

    @Test
    public void testGetPage(){
        Map<String, Integer> map = new HashMap<>();
        map.put("current",2);
        map.put("size",1);
        log.info("分页查询 第二页（每页一行）:{}",articleService.getPage(map));;
    }

}
