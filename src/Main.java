import com.student.manage.Student;
import com.student.manage.datafill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to my 1st JDBC application");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter 1 to ADD Student");
            System.out.println("Enter 2 to DELETE Student");
            System.out.println("Enter 3 to DISPLAY Students");
            System.out.println("Enter 4 to exit");
            int c = Integer.parseInt(br.readLine());

            if (c==1){
                System.out.println("Enter Student Id");
                int Id = Integer.parseInt(br.readLine());

                System.out.println("Enter student Name:");
                String name = br.readLine();

                System.out.println("Enter student phone:");
                String phone = br.readLine();

                System.out.println("Enter student City:");
                String city = br.readLine();


                Student stu = new Student(Id ,name, phone, city);
                datafill.insertToDb(stu);
                if (true){
                    System.out.println("Student added successfully..");
                }
                else {
                    System.out.println("Some error occurred..");
                }
                System.out.println(stu);

            } else if (c==2) {
                System.out.println("Enter the Id of student you want to delete");
                int id = Integer.parseInt(br.readLine());
                datafill.deleteStudent(id);
                if(true){
                    System.out.println("Student deleted from database successfully..");
                }
                else {
                    System.out.println("There was some problem in deleting the student..");
                }


            } else if (c==3) {
                datafill.displayStudents();

//            } else if (c==4) {
//                System.out.println("Enter the Id of student you want to update");
//                int id = Integer.parseInt(br.readLine());
//                datafill.updateStudent(id);

            } else if (c==4) {
                break;

            }
            else {

            }

        }
    }
}