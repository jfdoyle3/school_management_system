package src;

import src.objects.School;
import src.objects.Student;
import src.objects.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy=new Teacher(1,"Lizzy",500);
        Teacher sue=new Teacher(2,"Sue",700);
        Teacher sam=new Teacher(3,"Sam", 600);

        Student joe=new Student(1, "Joe", 4);
        Student jim=new Student(2,"Jim", 12);
        Student carla=new Student(3,"Carla",10);

        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(sue);
        teacherList.add(sam);

        List<Student> studentList=new ArrayList<>();
        studentList.add(joe);
        studentList.add(jim);
        studentList.add(carla);

        School ghs=new School(teacherList,studentList);

        carla.payFees(5000);
        joe.payFees(6000);
        System.out.println("GHS total money earned  $"+ghs.getTotalMoneyEarned());


        System.out.println("---- Making GHS Pay Salary ----");
        








    }
}
