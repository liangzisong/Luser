/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306_1
Source Server Version : 50162
Source Host           : localhost:3306
Source Database       : luser

Target Server Type    : MYSQL
Target Server Version : 50162
File Encoding         : 65001

Date: 2018-09-01 09:24:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `pk_id` int(11) NOT NULL,
  `fk_id` int(11) DEFAULT NULL,
  `user_account` varchar(255) NOT NULL COMMENT '账号',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(255) NOT NULL COMMENT '密码',
  `hiredate` date NOT NULL COMMENT '入职时间',
  `phone` varchar(25) DEFAULT NULL COMMENT '手机号',
  `position` varchar(255) DEFAULT NULL COMMENT '职位',
  `sex` int(2) DEFAULT NULL COMMENT '性别',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `marital_status` int(3) DEFAULT NULL COMMENT '婚姻状况',
  `identity_card` varchar(19) DEFAULT NULL COMMENT '身份证号码',
  `text1` varchar(255) DEFAULT NULL,
  `text2` varchar(255) DEFAULT NULL,
  `text3` varchar(255) DEFAULT NULL,
  `date1` date DEFAULT NULL,
  PRIMARY KEY (`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
