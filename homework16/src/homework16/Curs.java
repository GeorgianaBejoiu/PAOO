package homework16;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private Profesor profesor;
    private List<Student> listaStudenti;

    public Curs(String numeCurs, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.profesor = profesor;
        this.listaStudenti = new ArrayList<>();
    }

    public void addStudentToCourse(Student student) {
        listaStudenti.add(student);
        System.out.println("Studentul " + student.getNume() + " a fost adăugat la cursul " + numeCurs + ".");
    }

    public void removeStudentFromCourse(Student student) {
        if (listaStudenti.remove(student)) {
            System.out.println("Studentul " + student.getNume() + " a fost eliminat din cursul " + numeCurs + ".");
        } else {
            System.out.println("Studentul nu a fost găsit în acest curs.");
        }
    }

    public void addTeacherToCourse(Profesor profesor) {
        this.profesor = profesor;
        System.out.println("Profesorul " + profesor.getNume() + " a fost adăugat la cursul " + numeCurs + ".");
    }

    public void removeTeacherFromCourse() {
        if (this.profesor != null) {
            System.out.println("Profesorul " + this.profesor.getNume() + " a fost eliminat din cursul " + numeCurs + ".");
            this.profesor = null;
        } else {
            System.out.println("Nu există profesor pentru acest curs.");
        }
    }

    public static Curs createNewCourse(String numeCurs, List<Student> studenti, Profesor profesor) {
        Curs cursNou = new Curs(numeCurs, profesor);
        cursNou.listaStudenti.addAll(studenti);
        System.out.println("Cursul " + numeCurs + " a fost creat.");
        return cursNou;
    }
}
