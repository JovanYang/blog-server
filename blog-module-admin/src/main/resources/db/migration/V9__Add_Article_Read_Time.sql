-- 为article表添加阅读时长字段（单位：分钟）
ALTER TABLE `article` ADD COLUMN `read_time` int NOT NULL DEFAULT '0' COMMENT '阅读时长（分钟）' AFTER `like_count`; 