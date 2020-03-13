package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Discuss;

public interface DiscussService extends IService<Discuss> {

    /**
     * 添加评论
     * @param discuss
     * @return
     */
    Boolean saveDiscuss(Discuss discuss);

}
