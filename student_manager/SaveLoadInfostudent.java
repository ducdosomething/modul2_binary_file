package student_manager;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SaveLoadInfostudent {
    public void save(String path, ArrayList<Student> list) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));
        dos.writeInt(list.size());

        for (Student student : list) {
            dos.writeInt(student.getStudent_id());
            dos.writeUTF(student.getName());
            dos.writeInt(student.getListSubjects().size());

            for (Subject sub : student.getListSubjects()) {
                dos.writeInt(sub.getSubject_id());
                dos.writeUTF(sub.getSubject_name());
                dos.writeInt(sub.getCredits());
            }
        }
        dos.close();
    }

    public ArrayList<Student> load(String path) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists())
            return null;
        DataInputStream dis = new DataInputStream(new FileInputStream(path));
        int numberStudents = dis.readInt();
        for (int i = 0; i < numberStudents; i++) {
            int student_id = dis.readInt();
            String name = dis.readUTF();
            ArrayList<Subject> listSubject = new ArrayList<>();
            int numberSubjects = dis.readInt();
            for (int j = 0; j < numberSubjects; j++) {
                int subject_id = dis.readInt();
                String subject_name = dis.readUTF();
                int credits = dis.readInt();
                Subject sub = new Subject(subject_id, subject_name, credits);
                listSubject.add(sub);
            }
            Student st = new Student(student_id, name, listSubject);
            list.add(st);
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        // Subject s1 = new Subject(123, "Math", 4);
        // Subject s2 = new Subject(124, "sicence", 4);
        // Subject s3 = new Subject(125, "Physic", 2);
        // ArrayList<Subject> list1 = new ArrayList<>();
        // list1.add(s1);
        // list1.add(s2);
        // ArrayList<Subject> list2 = new ArrayList<>();
        // list2.add(s1);
        // list2.add(s3);
        // ArrayList<Student> listStudent = new ArrayList<>();
        // Student student1 = new Student(1, "Duc", list1);
        // Student student2 = new Student(2, "Huy", list2);
        // listStudent.add(student1);
        // listStudent.add(student2);
        // new SaveLoadInfostudent().save("student_manager/student.dat", listStudent);

        System.out.println(new SaveLoadInfostudent().load("student_manager/student.dat"));
    }
}
