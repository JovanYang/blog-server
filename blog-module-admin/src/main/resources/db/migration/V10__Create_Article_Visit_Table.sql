-- 文章访问记录表
CREATE TABLE `article_visit` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '访问ID',
  `article_id` bigint(20) NOT NULL COMMENT '文章ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID（匿名访问为空）',
  `ip` varchar(50) NOT NULL COMMENT '访问IP',
  `user_agent` varchar(500) DEFAULT NULL COMMENT '浏览器信息',
  `visit_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '访问时间',
  PRIMARY KEY (`id`),
  KEY `idx_article_id` (`article_id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_visit_time` (`visit_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章访问记录表';

-- 为article表添加PV和UV字段
ALTER TABLE `article` 
ADD COLUMN `pv` bigint(20) NOT NULL DEFAULT '0' COMMENT '页面浏览量' AFTER `view_count`,
ADD COLUMN `uv` bigint(20) NOT NULL DEFAULT '0' COMMENT '独立访客数' AFTER `pv`; 