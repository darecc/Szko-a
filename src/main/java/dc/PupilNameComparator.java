package dc;

import java.util.Comparator;

public class PupilNameComparator implements Comparator<Pupil> {
    public int compare(Pupil o1, Pupil o2) {
        int res = o1.getLastName().compareTo(o2.getLastName());
        if (res == 0)
            return o1.getFirstName().compareTo(o2.getFirstName());
        else
            return res;
    }


}
