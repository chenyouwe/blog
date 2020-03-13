package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@TableName("T_ARTICLE")
public class Article extends Model<Article> {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 访问次数
     */
    private Integer visitingTime;

    /**
     * 上传时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 所属目录id
     */
    private Integer catalogId;

    /**
     * 删除标记
     */
    private Integer deleteFlag;

    /**
     * 状态
     */
    private Integer state;

    public Article(Integer id){
        this.id =id;
    }

}
