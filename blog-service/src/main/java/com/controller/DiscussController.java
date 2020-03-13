package com.controller;

import com.entity.Discuss;
import com.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/discuss")
public class DiscussController {

    @Autowired
    private DiscussService discussService;

    @PutMapping
    public Boolean saveDiscuss(@RequestBody Discuss discuss) {
        return discussService.saveDiscuss(discuss);
    }

}
