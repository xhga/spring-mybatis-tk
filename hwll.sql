/*
Navicat MySQL Data Transfer

Source Server         : AAA_HWB
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : hwll

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-08-10 11:05:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` int(11) NOT NULL,
  `send_id` int(11) NOT NULL DEFAULT '0' COMMENT '发送者id',
  `receive_id` int(11) NOT NULL DEFAULT '0' COMMENT '接收者id',
  `group_id` varchar(22) NOT NULL DEFAULT '' COMMENT '组合id',
  `content` varchar(300) NOT NULL DEFAULT '' COMMENT '内容',
  `status` int(1) NOT NULL DEFAULT '0' COMMENT '状态(0未读 1已读)',
  `send_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '发送时间',
  `read_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '读取时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1', '0', '0', '', 'hahaha', '0', '2018-07-28 11:00:32', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '姓名',
  `age` int(4) NOT NULL DEFAULT '0' COMMENT '年龄',
  `phone` varchar(11) NOT NULL DEFAULT '' COMMENT '手机号',
  `pwd` varchar(16) NOT NULL DEFAULT '123456' COMMENT '密码',
  `sex` int(1) NOT NULL DEFAULT '0' COMMENT '性别(0保密 1男 2女)',
  `img` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',
  `qq` varchar(20) NOT NULL DEFAULT '' COMMENT 'qq',
  `status` int(1) NOT NULL DEFAULT '0' COMMENT '状态：0离线 1在线',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_phone` (`phone`,`pwd`) USING BTREE,
  KEY `idx_createtime` (`create_time`) USING BTREE,
  KEY `idx_name_time` (`name`,`create_time`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'hwb1', '18', '', '123456', '0', '', '', '0', '2018-07-28 10:53:42');
