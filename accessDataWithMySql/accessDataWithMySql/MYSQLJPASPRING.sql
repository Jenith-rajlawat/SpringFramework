create database db_example; -- Create the new database
create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user which can be authenticated to accesss the MySQL server. Then the user account can then be granted various priviliges such as the ability to execute certain SQL commands , or perform administrative tasks
grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
 
 -- springuser is a user name and it can connect from any host provided by % , if % had localhost then the user could only connect from localhost. (user, host)