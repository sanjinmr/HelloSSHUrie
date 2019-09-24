CREATE TABLE IF NOT EXISTS `t_user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `mobile` varchar(40) NOT NULL,
  PRIMARY KEY (`userid`)
);
INSERT INTO t_user (userid, name, password, email, mobile) VALUES (1, "zhangsan", "123456", "sanjicom", "13982053213");