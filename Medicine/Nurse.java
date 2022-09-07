package Medicine;

import java.util.ArrayList;
import java.util.Map;

public class Nurse implements Speaker{
    private ArrayList<Students> sickStudents;    // список студентов
    private Map <String, Integer> pillows;  // название таблетки, количество таблетки

    public Nurse(ArrayList<Students> students, Map<String, Integer> pillows) {
        this.sickStudents = students;
        this.pillows = pillows;
    }

    public ArrayList<Students> getStudents() {
        return sickStudents;
    }

    @Override
    public void goToChekup(ArrayList<Students> students) {
        for (Students s :students) {
            System.out.println(s.getName() + "  пройдите к врачу!");
        }
    }
}
