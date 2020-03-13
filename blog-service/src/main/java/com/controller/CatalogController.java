package com.controller;

import com.entity.Catalog;
import com.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping
    public List<Catalog> selectAll() {
        return catalogService.selectAll();
    }

    @PutMapping
    public Boolean saveCatalog(@RequestBody Catalog catalog) {
        return catalogService.saveCatalog(catalog);
    }

}
