package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernateUtil.HibernateUtil;
import model.Student;

public class StudentDao {

    public static void insertStudent(Student st) {
        Session session = HibernateUtil.getSession();
       session.save(st);
       Transaction tr= session.beginTransaction();
       tr.commit();
    }

    public static Student getStudent(int id) {
        Session session = HibernateUtil.getSession();
        Student st1 = session.get(Student.class, id);
        session.close();
        return st1;
    }

    public static boolean deleteStudent(int id) {
        Session session = HibernateUtil.getSession();
        Student st = session.get(Student.class, id);
        if (st != null) {
            session.beginTransaction();
            session.delete(st);
            session.getTransaction().commit();
            session.close();
            return true;
        } else {
            session.close();
            return false;
        }
    }

    public static boolean updateStudent(Student st) {
        Session session = HibernateUtil.getSession();
        Transaction tr=session.beginTransaction();
        session.saveOrUpdate(st);
        tr.commit();
        return true;
    }

    public  static List<Student> allStudentRecords() {
        Session session = HibernateUtil.getSession();
        Query<Student> query = session.createQuery("FROM Student", Student.class);
        List<Student> students = query.list();
        session.close();
        return students;
    }

    public static List<Student> searchStudentByName(String name) {
        Session session = HibernateUtil.getSession();
        Query<Student> query = session.createQuery("FROM Student WHERE name=:name", Student.class);
        query.setParameter("name", name);
        List<Student> students = query.list();
        session.close();
        return students;
    }

}
