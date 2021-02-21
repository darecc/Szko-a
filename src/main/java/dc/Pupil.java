package dc;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/*
    - firstName (imię),
    - lastName (nazwisko),
    - birthDate (data urodzenia)
    - noteList (listą ocen ucznia) : (List<Note>)
    - gettery dla wszystkich pól
 */
public class Pupil extends  Person{
    private LocalDate birthDate;

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    List<Note> noteList;
    public Pupil(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName);
        this.birthDate = birthDate;
        noteList = new ArrayList<Note>();
    }
    public void addNote(Note note) {
        noteList.add(note);
    }
    public double countAverageNote() {
        double suma = 0;
        double count = 0;
        for(Note note : noteList) {
            suma += note.getNote();
            count++;
        }
        double averageNote = suma / count;
        return averageNote;
    }
    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " aver. note= " + countAverageNote();
    }
}
