package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("T_CATALOG")
public class Catalog extends Model<Catalog> {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 类别名称
     */
    private String category;

    /**
     * 父类别id
     */
    private String fatherId;
}
