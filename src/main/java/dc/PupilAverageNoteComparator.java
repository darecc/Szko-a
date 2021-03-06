package dc;

import java.util.Comparator;

public class PupilAverageNoteComparator implements Comparator<Pupil> {
    public int compare(Pupil o1, Pupil o2) {
        return (int)(o1.countAverageNote()*100 - o2.countAverageNote()*100);
    }
}
