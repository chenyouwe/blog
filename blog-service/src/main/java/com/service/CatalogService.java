package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Catalog;

import java.util.List;

public interface CatalogService extends IService<Catalog> {

    /**
     * 返回所有目录，由前端处理
     * @return
     */
    List<Catalog> selectAll();

    /**
     * 添加一条目录
     * @return
     */
    Boolean saveCatalog(Catalog catalog);

}
