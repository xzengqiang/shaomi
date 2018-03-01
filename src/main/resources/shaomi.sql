/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50173
Source Host           : 127.0.0.1:3306
Source Database       : win

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2018-02-28 11:48:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for f_game_data_info
-- ----------------------------
DROP TABLE IF EXISTS `f_game_data_info`;
CREATE TABLE `f_game_data_info` (
  `ID` varchar(50) NOT NULL,
  `LEAGUE_INFO_ID` varchar(50) DEFAULT NULL COMMENT '联赛ID',
  `SEASON_INFO_ID` varchar(50) DEFAULT NULL COMMENT '赛季ID',
  `CUR_ROUND` int(8) DEFAULT NULL COMMENT '当前轮数',
  `A_ID` varchar(50) NOT NULL COMMENT '主队id',
  `B_ID` varchar(50) NOT NULL COMMENT '客队id',
  `A_FIRST_HALF_CORNER` int(8) NOT NULL COMMENT '主队上半场角球',
  `A_TOTAL_CORNER` int(8) NOT NULL COMMENT '主队全场角球',
  `A_FIRST_HALF_GOAL` int(8) NOT NULL COMMENT '主队上半场进球',
  `A_TOTAL_GOAL` int(8) NOT NULL COMMENT '主队全场进球',
  `B_FIRST_HALF_CORNER` int(8) NOT NULL COMMENT '客队上半场角球',
  `B_TOTAL_CORNER` int(8) NOT NULL COMMENT '客队全场角球',
  `B_FIRST_HALF_GOAL` int(8) NOT NULL COMMENT '客队上半场进球',
  `B_TOTAL_GOAL` int(8) NOT NULL COMMENT '客队全场进球',
  `GAME_TIME` datetime NOT NULL COMMENT '比赛时间',
  `MATCH_RESULT` int(8) NOT NULL COMMENT '赛果',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` datetime NOT NULL COMMENT '最后修改时间',
  `DEL_FLAG` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除标识 0-正常 1-删除',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for f_league_info
-- ----------------------------
DROP TABLE IF EXISTS `f_league_info`;
CREATE TABLE `f_league_info` (
  `id` varchar(50) NOT NULL,
  `name` varchar(255) NOT NULL COMMENT '联赛名称',
  `country` varchar(255) NOT NULL COMMENT '所属国家',
  `sort` int(16) NOT NULL COMMENT '排序',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `last_modify_time` datetime NOT NULL COMMENT '最后修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除标识 0-正常 1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for f_season_info
-- ----------------------------
DROP TABLE IF EXISTS `f_season_info`;
CREATE TABLE `f_season_info` (
  `ID` varchar(50) NOT NULL,
  `SEASON_NAME` varchar(255) NOT NULL COMMENT '赛季名称',
  `LEAGUE_INFO_ID` varchar(50) NOT NULL COMMENT '所属联赛ID',
  `GAME_ROUND` int(8) NOT NULL COMMENT '轮数',
  `SORT` int(16) NOT NULL COMMENT '排序',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` datetime NOT NULL COMMENT '最后修改时间',
  `DEL_FLAG` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除标识 0-正常 1-删除',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for f_team_info
-- ----------------------------
DROP TABLE IF EXISTS `f_team_info`;
CREATE TABLE `f_team_info` (
  `ID` varchar(50) NOT NULL,
  `TEAM_NAME` varchar(255) NOT NULL COMMENT '球队名称',
  `LEAGUE_INFO_ID` varchar(50) NOT NULL COMMENT '联赛ID',
  `REMARK` varchar(4000) NOT NULL COMMENT '球队简介（备注）',
  `SORT` int(16) NOT NULL COMMENT '排序',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` datetime NOT NULL COMMENT '最后修改时间',
  `DEL_FLAG` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除标识 0-正常 1-删除',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for f_user
-- ----------------------------
DROP TABLE IF EXISTS `f_user`;
CREATE TABLE `f_user` (
  `id` varchar(50) NOT NULL,
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `sex` tinyint(2) NOT NULL DEFAULT '1' COMMENT '性别',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `phone_number` varchar(255) DEFAULT NULL COMMENT '电话',
  `head_image_url` varchar(255) DEFAULT NULL COMMENT '头像',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `last_modify_time` datetime NOT NULL COMMENT '最后修改时间',
  `del_flag` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除标识 0-正常 1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
