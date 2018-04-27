/*  
Navicat MySQL Data Transfer  
  
Source Server         : 本地  
Source Server Version : 50528  
Source Host           : localhost:3306  
Source Database       : shiro  
  
Target Server Type    : MYSQL  
Target Server Version : 50528  
File Encoding         : 65001  
  
Date: 2017-09-14 16:41:39  
*/  
  
SET FOREIGN_KEY_CHECKS=0;  
  
-- ----------------------------  
-- Table structure for `sys_permission`  
-- ----------------------------  
DROP TABLE IF EXISTS `sys_permission`;  
CREATE TABLE `sys_permission` (  
  `id` bigint(20) NOT NULL AUTO_INCREMENT,  
  `url` varchar(256) DEFAULT NULL COMMENT 'url地址',  
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上级ID',
  `parent_ids` varchar(256) DEFAULT NULL COMMENT '上级ID集合',
  `permission` varchar(64) DEFAULT NULL COMMENT '权限初始化',
  `name` varchar(64) DEFAULT NULL COMMENT '描述',  
  `resource_type` varchar(32) DEFAULT NULL COMMENT '资源类型',
  `available` bit(1) DEFAULT 1 COMMENT '是否可见',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;  
  
-- ----------------------------  
-- Records of sys_permission  
-- ----------------------------  
INSERT INTO `sys_permission` VALUES ('1', '/static/**', null, null, 'anon', '静态资源', '0', 1);
INSERT INTO `sys_permission` VALUES ('2', '/ajaxLogin',  null, null, 'anon', 'ajax登录', '0', 1);
INSERT INTO `sys_permission` VALUES ('3', '/logout',  null, null, 'logout', '安全退出', '0', 1);
INSERT INTO `sys_permission` VALUES ('4', '/*/*/upload',  null, null, 'anon', '上传文件', '0', 1);
INSERT INTO `sys_permission` VALUES ('5', '/admin/content',  null, null, 'admin:content', '首页/系统管理', '0', 1);
INSERT INTO `sys_permission` VALUES ('6', '/cms/content',  null, null, 'cms:content', '内容管理', '0', 1);
INSERT INTO `sys_permission` VALUES ('7', '/apps/content',  null, null, 'apps:content', '首页', '0', 1);
INSERT INTO `sys_permission` VALUES ('8', '/**', 'authc', null, null,  '其他全部拦截', '0', 1);
INSERT INTO `sys_permission` VALUES ('9', '/cms/article/add',  null, null, 'article:add', '文章添加', '0', 1);
  
-- ----------------------------  
-- Table structure for `sys_role`  
-- ----------------------------  
DROP TABLE IF EXISTS `sys_role`;  
CREATE TABLE `sys_role` (  
  `id` bigint(20) NOT NULL AUTO_INCREMENT,  
  `name` varchar(32) DEFAULT NULL COMMENT '角色名称',  
  `creator` varchar(64) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',  
  `updater` varchar(64) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',  
  `available` BIT(1) DEFAULT 1 COMMENT '是否有效',
  `desc` varchar(128) DEFAULT NULL COMMENT '描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
-- ----------------------------  
-- Records of sys_role  
-- ----------------------------  
INSERT INTO `sys_role` VALUES ('1', 'admin', '1', null, null, null, 1, '管理员');
  
-- ----------------------------  
-- Table structure for `sys_role_permission`  
-- ----------------------------  
DROP TABLE IF EXISTS `sys_role_permission`;  
CREATE TABLE `sys_role_permission` (  
  `id` bigint(20) NOT NULL AUTO_INCREMENT,  
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID',  
  `pid` bigint(20) DEFAULT NULL COMMENT '权限ID',  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;  
  
-- ----------------------------  
-- Records of sys_role_permission  
-- ----------------------------  
INSERT INTO `sys_role_permission` VALUES ('1', '1', '1');  
INSERT INTO `sys_role_permission` VALUES ('2', '1', '2');  
INSERT INTO `sys_role_permission` VALUES ('3', '1', '3');  
INSERT INTO `sys_role_permission` VALUES ('4', '1', '4');  
INSERT INTO `sys_role_permission` VALUES ('5', '1', '5');  
INSERT INTO `sys_role_permission` VALUES ('6', '1', '6');  
INSERT INTO `sys_role_permission` VALUES ('7', '1', '7');  
INSERT INTO `sys_role_permission` VALUES ('8', '1', '8');  
  
-- ----------------------------  
-- Table structure for `sys_user`  
-- ----------------------------  
DROP TABLE IF EXISTS `sys_user`;  
CREATE TABLE `sys_user` (  
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',  
  `no` varchar(100) DEFAULT NULL COMMENT '工号',  
  `password` varchar(100) DEFAULT NULL COMMENT '密码',  
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',  
  `rid` bigint(20) DEFAULT NULL COMMENT '角色id',  
  `rname` varchar(100) DEFAULT NULL COMMENT '角色名称',  
  `email` varchar(200) DEFAULT NULL COMMENT '邮箱',  
  `mobile` varchar(200) DEFAULT NULL COMMENT '手机',  
  `login_ip` varchar(100) DEFAULT NULL COMMENT '当前登录ip',  
  `login_date` datetime DEFAULT NULL COMMENT '当前登录时间',  
  `last_login_ip` varchar(100) DEFAULT NULL COMMENT '最后登陆IP',  
  `last_login_date` datetime DEFAULT NULL COMMENT '最后登陆时间',  
  `creator` varchar(64) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',  
  `updater` varchar(64) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',  
  `salt` varchar(100) DEFAULT NULL COMMENT '盐',
  `status` bigint(1) DEFAULT '1' COMMENT '状态（1有效/0禁止登录）',
  PRIMARY KEY (`id`),
  KEY `sys_user_update_date` (`update_date`)  
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='用户表';  
  
-- ----------------------------  
-- Records of sys_user  
-- ----------------------------  
INSERT INTO `sys_user` VALUES ('27', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'admin', '1', 'admin', '11@11.com', '13111111111', null, null, '0:0:0:0:0:0:0:1', '2017-03-08 20:22:31', '2,超级管理员', '2015-11-06 14:01:01', '27,shen', '2017-03-08 20:22:31',null, '0');