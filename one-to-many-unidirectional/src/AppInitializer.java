import entity.Laptop;
import entity.Student;
import org.hibernate.Session;

public class AppInitializer {
    public static void main(String[] args) {
       /* try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Laptop laptop = new Laptop();
            laptop.setBrand("Lenovo");

            Student student = new Student();
            student.setStudentName("Nimal");
            student.setLaptop(laptop);
            session.persist(student);
            transaction.commit();
        }*/

    }

}
