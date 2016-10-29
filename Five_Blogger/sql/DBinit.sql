DROP TABLE IF EXISTS User;
DROP TABLE IF EXISTS Role;
DROP TABLE IF EXISTS Article;
DROP TABLE IF EXISTS ArticleType;
DROP TABLE IF EXISTS Discuss;
DROP TABLE IF EXISTS Article_Discuss;

/**
 * �û���
 */
CREATE TABLE User (
  userId int auto_increment,
  userName char(16),
  userPwd char(25),
  sex varchar(2),
  registerTime datetime,
  lastLoginTime datetime,
  longinCount int,
  user_role int,
  email varchar(20) default NULL,
  PRIMARY KEY  (userId)
);

/**
 * ��ɫ��
 */
CREATE TABLE Role (
  roleId int auto_increment,
  roleName char(16),
  PRIMARY KEY  (roleId)
);

/**
 * ���±�
 */
CREATE TABLE Article (
  articleId int auto_increment,
  title varchar(20) NOT NULL,
  author int,
  content text,
  articleType int,
  createTime datetime,
  updateTime datetime,
  likeCount int,
  PRIMARY KEY  (articleId)
) ;

/**
 * �������ͱ�
 */
CREATE TABLE ArticleType (
  typeId int auto_increment,
  typeName varchar(16),
  PRIMARY KEY  (typeId)
) ;

/**
 * ���۱�
 */
CREATE TABLE Discuss (
  discussId int auto_increment,
  discussContent text ,
  createtime datetime,
  PRIMARY KEY  (discussId)
);

/**
 * �������۹�ϵ��
 */
CREATE TABLE Article_Discuss (
  articleId int,
  discussId int,
  PRIMARY KEY  (articleId,disCussId)
);