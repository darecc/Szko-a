package dc;

import java.util.HashSet;

public class Teacher extends Person {
    public HashSet<String> getSubjects() {
        return subjects;
    }
    private HashSet<String> subjects;
    public Teacher(String firstName, String lastName, HashSet<String> subjects) {
        super(firstName, lastName);
        this.subjects = subjects;
    }
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        subjects = new HashSet<String>();
    }
    public void addSubject(String subject) {
        subjects.add(subject);
    }
}
