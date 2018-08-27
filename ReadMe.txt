
#Online Book Store

This is an online Book Store.

Following are links related to technologies used in this application :

Bootstrap 3: http://getbootstrap.com/docs/3.3/getting-started/#download

Google Search Bootstrap Navbar Template, following is the URL:

https://getbootstrap.com/docs/3.3/examples/navbar/

http://getbootstrap.com/docs/3.3/javascript/#carousel

https://picsum.photos/

https://getbootstrap.com/docs/3.3/components/#panels

https://www.a2hosting.in/kb/developer-corner/mysql/managing-mysql-databases-and-users-from-the-command-line


Boot Strap Thymeleaf URL: https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-thymeleaf

We need to set below properties in "application.properties", 
for viewing the changes made in "index.html" without restarting tomcat.

spring.thymeleaf.cache=false



--Following are related to SQL:


>mysql -u root -p
Password : password


SELECT concat('DROP TABLE IF EXISTS `', table_name, '`;') 
FROM information_schema.tables WHERE table_schema = 'BOOKSTOREDATABASE';


 DROP TABLE IF EXISTS `hibernate_sequence`;
 DROP TABLE IF EXISTS `password_reset_token`;
 DROP TABLE IF EXISTS `role`;
 DROP TABLE IF EXISTS `user`;
 DROP TABLE IF EXISTS `user_role`;
 

