/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-08-13 09:48:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_grade
-- ----------------------------
DROP TABLE IF EXISTS `user_grade`;
CREATE TABLE `user_grade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) NOT NULL DEFAULT '0',
  `datainfo` varchar(300) NOT NULL DEFAULT '' COMMENT '数据信息',
  `score` int(8) NOT NULL DEFAULT '0' COMMENT '成绩',
  `timer` varchar(35) NOT NULL DEFAULT '' COMMENT '时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='成绩表';

-- ----------------------------
-- Records of user_grade
-- ----------------------------
INSERT INTO `user_grade` VALUES ('5', '1', '测试', '100', '2018-05-26', '2019-08-09 15:21:01');
INSERT INTO `user_grade` VALUES ('6', '1', '测试', '100', '2018-05-25', '2019-08-09 15:21:01');
INSERT INTO `user_grade` VALUES ('7', '1', '123456', '90', '2018-05-25', '2019-08-09 17:16:23');

-- ----------------------------
-- Table structure for xnlogin
-- ----------------------------
DROP TABLE IF EXISTS `xnlogin`;
CREATE TABLE `xnlogin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `email_address` varchar(30) NOT NULL DEFAULT '' COMMENT '邮箱',
  `user_name` varchar(30) NOT NULL DEFAULT '' COMMENT '用户名',
  `unit` varchar(50) NOT NULL DEFAULT '' COMMENT '单位',
  `password` varchar(30) NOT NULL DEFAULT '' COMMENT '密码',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='信息表';

-- ----------------------------
-- Records of xnlogin
-- ----------------------------
INSERT INTO `xnlogin` VALUES ('1', 'ceshi.youxiang', 'ceshi', '下雨天', '123456', '2019-08-09 15:20:39', '2019-08-09 15:20:39');
