package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Discuss;
import com.mapper.DiscussMapper;
import com.service.DiscussService;
import org.springframework.stereotype.Service;

@Service
public class DiscussServiceImpl extends ServiceImpl<DiscussMapper, Discuss> implements DiscussService {

    public Boolean saveDiscuss(Discuss discuss) {
        return save(discuss);
    }

}
