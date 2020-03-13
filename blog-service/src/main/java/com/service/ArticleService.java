package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService  extends IService<Article> {
    /**
     * 新增或修改文章
     * @param article
     * @return
     */
    Boolean saveOrUpdateArticleService(Article article);

    /**
     * 删除文章
     * @param id
     * @return
     */
    Boolean delArticleService(Integer id);

    /**
     * @Param
     * @param map   current当前页、size每页个数
     * @return
     */
    List<Article> getPage(Map<String, Integer> map);
}
