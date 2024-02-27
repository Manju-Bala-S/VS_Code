package pkg3;

import pkg1.Department;
import pkg2.Student;

public class Main {
    public static void main(String args[]){
        Student s1 = new Student(1, "Manju");
        Department d1 = new Department("AI&DS");
        s1.setDepartment(d1);
        s1.display();
    }
}
