1. 本项目使用的MySQL版本为 8.0.22  JDK版本为11  如果运行报错 可能为其中一个环境版本过高过低导致不兼容
2. 数据库连接的参数需要根据不同情况进行改变：
       String url = "jdbc:mysql://localhost:3306/library?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "***";
        String passWord = "****";  
       以本项目为例   user 和 passWord需要根据个人情况改变   url中库名library根据你的books和users表放在哪个数据库中而决定
3.  进行数据库操作需要借助mysql-connector-java-8.0.22.jar驱动   此文件要加载到项目中   文件放置在项目sql文件中
4.  本项目用到了两个数据库表  books和users  创建表的sql文件在sql文件夹下  名为createBooks.sql  createUsers.sql
5.  本项目用到的测试数据在sql文件下的books.sql  和 user.sql 中  只需运行就会加载到对应的表中
6.  本项目的运行初始化类 为 src/GUI/logIn/LogIn.java

