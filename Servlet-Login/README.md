## 用户登录案例：
1. 编写login.html登录页面（username&password两个输入框）
2. 使用Druid数据库连接池技术，操作mysql，jikaigg库中user表
3. 使用JDBC Template技术封装JDBC
4. 登录成功跳转到SuccessServlet展示：登陆成功！用户名，欢迎您！
5. 登录时便跳转到FailServlet展示：登陆失败！用户名或密码错误！

## 开发步骤
1. 导入jar包，html页面，配置文件
2. 创建数据库环境
```mysql
CREATE TABLE user_demo(
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(32) UNIQUE NOT NULL,
`password` VARCHAR(32) NOT NULL 
);
```
3. 创建包com.jikaigg.domain，创建类user
4. 创建包com.jikaigg.dao，创建类userDao


