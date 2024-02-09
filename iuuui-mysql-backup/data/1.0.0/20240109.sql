CREATE TABLE `iuuui_mysql_dump_params` (
  `id` bigint(64) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `command` varchar(255) DEFAULT NULL,
  `has_value` bit(1) DEFAULT NULL,
  `has_required` bit(1) DEFAULT NULL,
  `command_value` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='mysqldump 导出可配置参数';