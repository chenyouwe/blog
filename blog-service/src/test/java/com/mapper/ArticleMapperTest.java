package com.mapper;

import com.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testInsert() {
        Article article = new Article();
        article.setContent("t2");
        article.setCreateTime("2020-02-02 11:11:11");
        article.setDeleteFlag(0);
        article.setTitle("t");
        article.setCatalogId(1);
        article.setUpdateTime("2020-02-02 22:22:22");
        article.setVisitingTime(3);
        articleMapper.insert(article);
    }

}
