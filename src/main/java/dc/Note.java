package dc;

public class Note {
    public String getSubjectName() {
        return subjectName;
    }

    public double getNote() {
        return note;
    }

    private String subjectName;
    private double note;

    public Note(String subjectName, double note) {
        this.subjectName = subjectName;
        this.note = note;
    }
}
