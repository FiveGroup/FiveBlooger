DROP TABLE IF EXISTS `blogger_comment`;
DROP TABLE IF EXISTS `blogger_article`;
DROP TABLE IF EXISTS `blogger_user`;

CREATE TABLE `blogger_user` (
  `user_id` int(11) auto_increment,
  `user_name` char(16) NOT NULL,
  `user_password` char(25) NOT NULL,
  `email` varchar(20) default NULL,
  PRIMARY KEY  (`user_id`)
);

CREATE TABLE `blogger_article` (
  `art_id` int(11) auto_increment,
  `art_title` varchar(20) NOT NULL,
  `art_content` longtext NOT NULL,
  `auther_id` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  `lastupdatetime` datetime default NULL,
  `likenum` int(11) default NULL,
  `readtime` int(11) default NULL,
  PRIMARY KEY  (`art_id`),
  KEY `auther_id` (`auther_id`),
  CONSTRAINT `blogger_article_ibfk_1` FOREIGN KEY (`auther_id`) REFERENCES `blogger_user` (`user_id`)
) ;

CREATE TABLE `blogger_comment` (
  `comment_id` int(11) auto_increment,
  `art_id` int(11) NOT NULL,
  `comment_content` varchar(120) NOT NULL,
  `createtime` datetime NOT NULL,
  `observer` char(16) NOT NULL,
  `likenum` int(11) default NULL,
  PRIMARY KEY  (`comment_id`),
  KEY `art_id` (`art_id`),
  CONSTRAINT `blogger_comment_ibfk_1` FOREIGN KEY (`art_id`) REFERENCES `blogger_article` (`art_id`)
);