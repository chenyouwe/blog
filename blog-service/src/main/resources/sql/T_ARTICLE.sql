CREATE TABLE T_ARTICLE (
   ID int(5) PRIMARY KEY NOT NULL auto_increment,
   TITLE VARCHAR(50) COMMENT '标题',
   CONTENT MEDIUMTEXT COMMENT '内容',
   VISITING_TIME int(10) COMMENT '访问次数',
   CREATE_TIME VARCHAR(20) COMMENT '创建时间',
   UPDATE_TIME VARCHAR(20) COMMENT '修改时间',
   CATALOG_ID int(5)  COMMENT '所属目录id',
   DELETE_FLAG int(1)  COMMENT '删除标志（0正常、1删除）',
   STATE int(1) COMMENT '状态（0暂存、1发布）'
) COMMENT = '文章表';
