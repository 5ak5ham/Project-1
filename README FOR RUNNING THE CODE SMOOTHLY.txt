This is a student management system on which you can add, delete and view students present in your database

Run Main.java to run this code....

But first open the code in your prefered IDE and follow the steps :-

1) Setup mysql connector for your prefered IDE (JAR file)

2) Now inside src folder go to package com.student.manage...

3) Open mysqlconnection.java file and in *String user = "root"* enter your username, most probably it will be user only but check first...

4) In  *String pass = "********" * write your own password which you have setup in your mysql...

5) In *String url = "jdbc:mysql://localhost:3306/Student";* to run this first create a database "Student" in mysql....

6) Set the column names in your table as "sid" - Integer - for student id
                                         "sname" - Varchar - for student name
                                         "sphone" - Varchar - for phone number 
                                         "studentCity" - Varchar - for city from where student belongs

7) You can try different columns according to your need but you will have to setup datafill.java, Main.java and Student.java accordingly...

8) If you are using any other RDBMS instead of MySQL then change Class.forName and other things accordingly to the DBMS you are using...

9) Thank you for reading....

10) It will run on console and mysql only but I will surely update this project with a proper GUI and more features...


