package dc;

import com.google.gson.Gson;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Klasa klasa = Klasa.getInstance("klasa mat-fiz");
        //region wklepywanie danych (region tworzymy poprzez Ctrl+Alt+T
        Pupil p1 = new Pupil("Jan", "Nowak", LocalDate.of(2005, 5, 21));
        Pupil p2 = new Pupil("Anna", "Mucha", LocalDate.of(2003, 6, 11));
        Pupil p3 = new Pupil("Leon", "Czyżyk", LocalDate.of(2006, 7, 12));
        Pupil p4 = new Pupil("Olga", "Praska", LocalDate.of(2005, 8, 2));
        Pupil p5 = new Pupil("Sylwia", "Piątek", LocalDate.of(2005, 1, 22));
        List<Pupil> pupils = (List<Pupil>) Arrays.asList(new Pupil[] {p1,p2,p3,p4,p5});
        klasa.addPupil(p1);
        klasa.addPupil(p2);
        klasa.addPupil(p3);
        klasa.addPupil(p4);
        klasa.addPupil(p5);
        Teacher t1 = new Teacher("Zenon", "Żyto");
        Teacher t2 = new Teacher("Dorota", "Nowakowska");
        Teacher t3 = new Teacher("Cecylia", "Ciesielska");
        Teacher t4 = new Teacher("Roman", "Dmowczyk");
        t1.addSubject("matematyka");
        t1.addSubject("fizyka");
        t1.addSubject("chemia");
        t1.addSubject("chemia");
        t1.addSubject("chemia");
        t1.addSubject("WF");
        t2.addSubject("język polski");
        t2.addSubject("język angielski");
        t2.addSubject("język niemiecki");
        t2.addSubject("historia");
        t3.addSubject("geografia");
        t3.addSubject("chemia");
        t3.addSubject("historia");
        t3.addSubject("religia");
        t4.addSubject("matematyka");
        t4.addSubject("fizyka");
        t4.addSubject("religia");
        t4.addSubject("język angielski");
        klasa.addTeacher(t1);
        klasa.addTeacher(t2);
        klasa.addTeacher(t3);
        klasa.addTeacher(t4);
        klasa.addSubject("język polski");
        klasa.addSubject("język angielski");
        klasa.addSubject("historia");
        klasa.addSubject("geografia");
        klasa.addSubject("matematyka");
        klasa.addSubject("fizyka");
        klasa.addSubject("chemia");
        p1.addNote(new Note("matematyka", 4.5));
        p1.addNote(new Note("fizyka", 4.0));
        p1.addNote(new Note("chemia", 3.5));
        p1.addNote(new Note("geografia", 5.0));
        p1.addNote(new Note("historia", 3.0));
        p1.addNote(new Note("język polski", 2.0));
        p1.addNote(new Note("język angielski", 2.0));
        p2.addNote(new Note("matematyka", 3.5));
        p2.addNote(new Note("fizyka", 3.0));
        p2.addNote(new Note("chemia", 2.5));
        p2.addNote(new Note("geografia", 3.0));
        p2.addNote(new Note("historia", 3.5));
        p2.addNote(new Note("język polski", 3.0));
        p2.addNote(new Note("język angielski", 4.0));
        p3.addNote(new Note("matematyka", 3.5));
        p3.addNote(new Note("fizyka", 3.0));
        p3.addNote(new Note("chemia", 3.5));
        p3.addNote(new Note("geografia", 2.0));
        p3.addNote(new Note("historia", 2.0));
        p3.addNote(new Note("język polski", 3.5));
        p4.addNote(new Note("matematyka", 3.5));
        p4.addNote(new Note("fizyka", 4.5));
        p4.addNote(new Note("chemia", 4.5));
        p4.addNote(new Note("geografia", 4.0));
        p4.addNote(new Note("historia", 4.0));
        p4.addNote(new Note("język polski", 3.5));
        p4.addNote(new Note("język angielski", 4.0));
        p5.addNote(new Note("matematyka", 4.5));
        p5.addNote(new Note("fizyka", 5.0));
        p5.addNote(new Note("chemia", 4.5));
        p5.addNote(new Note("geografia", 4.5));
        p5.addNote(new Note("historia", 5.0));
        p5.addNote(new Note("język polski", 3.5));
        p5.addNote(new Note("język angielski", 4.0));
        //endregion)
        System.out.println("=== AVERAGE NOTE FOR P5 ===");
        System.out.println(p5.countAverageNote());
        System.out.println(klasa.calculateAverageNote(p5));
        System.out.println("=== AVERAGE NOTE FOR fizyka ===");
        try {
            System.out.println(klasa.calculateAverageNote("fizyka"));
        }
        catch(ClassException ce) {
            System.out.println(ce.getMessage());
        }
        System.out.println("=== AVERAGE NOTE FOR ALL SUBJECTS AND PUPILS ===");
        try {
            System.out.println(klasa.calculateAverageNote());
        }
        catch(ClassException ce) {
            System.out.println(ce.getMessage());
        }
        // przedmioty bez oceny dla ucznia p5
        klasa.showAbsentNotes(p5);
        // posortowanie uczniów wg nazwisk i imion
        klasa.sortPupils(new PupilNameComparator());
        // wyświetlenie listy uczniów posortowanych wg nazwisk i imion
        System.out.println("=== LIST OF PUPILS SORTED BY NAMES");
        klasa.showPupils();
        // posortowanie uczniów wg średniej ocen
        klasa.sortPupils(new PupilAverageNoteComparator());
        // wyświetlenie listy uczniów posortowanych wg średniej ocen
        System.out.println("=== LIST OF PUPILS SORTED BY AVERAGE NOTES");
        klasa.showPupils();
        klasa.saveToFile("klasa.json");
    }
}
