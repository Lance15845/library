CREATE TABLE users (
  userId int(11) NOT NULL AUTO_INCREMENT,
  userName varchar(20),
	userPassword varchar(20),
  PRIMARY KEY (userId)
) DEFAULT CHARSET=UTF8;