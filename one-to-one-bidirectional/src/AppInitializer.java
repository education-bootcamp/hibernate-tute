import entity.Laptop;
import entity.Student;
import org.hibernate.Session;

public class AppInitializer {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            Student student = new Student();
            student.setStudentName("Nimal");
            Laptop laptop = new Laptop();
            laptop.setBrand("Lenovo");
            laptop.setStudent(student);

            session.save(student);
        }

    }

}
