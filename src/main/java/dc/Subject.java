package dc;

public class Subject {
    public String getName() {
        return name;
    }

    private String name;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private Teacher teacher;

    public Subject(String name) {
        this.name = name;
    }
    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
