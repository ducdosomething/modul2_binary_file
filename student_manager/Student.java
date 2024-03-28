package student_manager;

import java.util.ArrayList;

public class Student {

    private int student_id;
    private String name;
    private ArrayList<Subject> listSubjects;

    public Student(int student_id, String name, ArrayList<Subject> listSubjects) {
        this.student_id = student_id;
        this.name = name;
        this.listSubjects = listSubjects;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject> getListSubjects() {
        return listSubjects;
    }

    public void setListSubjects(ArrayList<Subject> listSubjects) {
        this.listSubjects = listSubjects;
    }

    @Override
    public String toString() {
        return "Student [student_id=" + student_id + ", name=" + name + ", listSubjects=" + listSubjects + "]";
    }

}
