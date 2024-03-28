package student_manager;

public class Subject {
    private int subject_id;
    private String subject_name;
    private int credits;

    public Subject(int subject_id, String subject_name, int credits) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.credits = credits;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject [subject_id=" + subject_id + ", subject_name=" + subject_name + ", credits=" + credits + "]";
    }

}
