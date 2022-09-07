package Medicine;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList();
        Map<String, Integer> pillows = new HashMap();
        ArrayList<Students> sickStudents = new ArrayList();
        Students student1 = new Students("Inanov", 8, true);
        Students student2 = new Students("Petrov", 10, false);
        Students student3 = new Students("Sidorov", 9, true);
        Students student4 = new Students("Chapaev", 20, false);
        Students student5 = new Students("Baranov", 15, true);
        Students student6 = new Students("Bublikov", 15, true);
        Students student7 = new Students("Kozlov", 15, true);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        pillows.put("Ugol", 100000);
        pillows.put("Aspirin", 10);
        pillows.put("Zelenka", 100);
        System.out.println("--------------------------------------------------");
        System.out.println("Список имен всех студентов");
        Iterator var11 = students.iterator();

        while(var11.hasNext()) {
            Students s = (Students)var11.next();
            System.out.println(s.getName());
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Список имен всех студентов отсортированный по возрасту");
        ComporatorByAge comporatorByAge = new ComporatorByAge();
        students.sort(comporatorByAge);
        Iterator iterator = students.iterator();

        while(iterator.hasNext()) {
            Students s = (Students)iterator.next();
            System.out.println(s.getName());
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Список имен заболевших студентов");
        iterator = students.iterator();
        Iterator var17 = students.iterator();

        while(var17.hasNext()) {
            Students iter = (Students)var17.next();
            sickStudents.add(iter);
            if (!iter.isIllness()) {
                sickStudents.remove(iter);
            } else {
                System.out.println(iter.getName());
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Список имен студентов, приглашенных на медосмотр");
        Nurse nurse1 = new Nurse(sickStudents, pillows);
        nurse1.goToChekup(sickStudents);
    }
}
