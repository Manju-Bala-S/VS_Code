package pkg2;
import pkg1.Department;

public class Student {
    static int n;
    int id;
    String name;
    static String clgName;
    String dept;

    static void changeClgName(){
        clgName = "Mepco";
    }

    public Student(int p1,String p2){
        n++;
        //Department d1 = new Department("AI&DS");
        //this.setDepartment(d1);
        id = p1;
        name = p2;
        //this.display();
    }

    public void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Name:"+clgName);
        System.out.println("Dept.:"+dept);
    }

    public void setDepartment(Department d1){
        dept = d1.deptName;
    }

    /*public static void main(String args[]){
        Student s1 = new Student(1, "Manju");
        Department d1 = new Department("AI&DS");
        s1.setDepartment(d1);
        s1.display();
    }*/
}
