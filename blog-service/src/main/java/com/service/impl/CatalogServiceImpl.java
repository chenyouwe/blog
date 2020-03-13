package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Catalog;
import com.mapper.CatalogMapper;
import com.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl extends ServiceImpl<CatalogMapper, Catalog> implements CatalogService {

    public List<Catalog> selectAll() {
        return list();
    }

    public Boolean saveCatalog(Catalog catalog){
        return save(catalog);
    }
}
