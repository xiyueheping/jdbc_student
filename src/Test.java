import domain.Student;
import service.Serv_student;
import service.serv_impl.Serv_studentimpl;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Serv_student serv_student = new Serv_studentimpl();
        //获取所有学生信息
        ArrayList<Student> all = serv_student.getall();
        System.out.println("所有学生信息");
        for (Student s:all){
            System.out.println(s);
        }

        //添加一个学生信息
//        Student s = new Student("张三","男",1,"计算机","郑州");
//        String s1 = new Serv_studentimpl().addstu(s);
//        System.out.println(s1);

        //删除一个学生信息
//        String delstu = serv_student.delstu(6);
//        System.out.println(delstu);
        //获取名为张三的学生
//        Student student = serv_student.getstubyname("张3三");
//        System.out.println("获取名为张三的学生信息");
//        System.out.println(student);
        //修改id为1的学生的信息
//        Student s = new Student(1,"张三","男",18,"计算机","伊拉克");
//        String alterstu = serv_student.alterstu(s);
//        System.out.println(alterstu);

        //获取所有学生信息
        ArrayList<Student> all2 = serv_student.getall();
        System.out.println("所有学生信息");
        for (Student s2:all){
            System.out.println(s2);
        }
    }

}
