package com.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.constant.EnumDeleteFlag;
import com.entity.Article;
import com.mapper.ArticleMapper;
import com.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    public Boolean saveOrUpdateArticleService(Article article) {
        return saveOrUpdate(article);
    }

    public Boolean delArticleService(Integer id) {
        Article article = new Article(id);
        article.setDeleteFlag(EnumDeleteFlag.DELETE.getCode());
        return updateById(article);
    }

    public List<Article> getPage(Map<String, Integer> map) {
        IPage<Article> articlePage = new Page<>(map.get("current"), map.get("size"));//参数一是当前页，参数二是每页个数
        Article select = new Article();
        select.setDeleteFlag(EnumDeleteFlag.NORMAL.getCode());
        articlePage = baseMapper.selectPage(articlePage, new QueryWrapper<>(select));
        List<Article> list = articlePage.getRecords();
        return list;
    }

}
