package dc;

import java.time.LocalDate;
import java.util.List;

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
    }
    public void addNote(Note note) {
        noteList.add(note);
    }

}
