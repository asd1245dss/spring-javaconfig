DROP TABLE IF EXISTS `work_order`;
CREATE TABLE `work_order` (
  `id` int(11) NOT NULL,
  `reflector_name` varchar(20) DEFAULT NULL COMMENT '反映人',
  `reflector_phone` varchar(20) DEFAULT NULL COMMENT '反映人电话',
  PRIMARY KEY (`id`)
);

INSERT INTO `work_order` VALUES (1, '张三1', '13811111111');
INSERT INTO `work_order` VALUES (2, '张三2', '13811111111');
INSERT INTO `work_order` VALUES (3, '张三3', '13811111111');
INSERT INTO `work_order` VALUES (4, '张三4', '13811111111');
INSERT INTO `work_order` VALUES (5, '张三5', '13811111111');
INSERT INTO `work_order` VALUES (6, '张三6', '13811111111');
INSERT INTO `work_order` VALUES (7, '张三7', '13811111111');
INSERT INTO `work_order` VALUES (8, '张三8', '13811111111');
INSERT INTO `work_order` VALUES (9, '张三9', '13811111111');
INSERT INTO `work_order` VALUES (10, '张三10', '13811111111');
