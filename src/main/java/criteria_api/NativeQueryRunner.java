package criteria_api;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NativeQueryRunner {
    static final SessionFactory sessionFactory =  new Configuration().buildSessionFactory();
    static final Session session = sessionFactory.openSession();
    public static void main(String[] args) {

        try (sessionFactory; session) {
            session.beginTransaction();

            //Получение с помощью классического HQL
//            Query<Supervisor> supervisors = session.createQuery("from Supervisor ", Supervisor.class);
//            List<Supervisor> supervisorList = supervisors.list();
//            for (Supervisor supervisor : supervisorList) {
//                System.out.println(supervisor);
//            }

            //Получение с помощью NativeQuery
//            List<Object[]> list = session.createNativeQuery("select * from company.supervisors").list();
//            for (Object[] objects : list) {
//                System.out.println(Arrays.toString(objects));
//            }

            //Маппинг
//            NativeQuery<Supervisor> nativeQuery = session.createNativeQuery("select * from company.supervisors", Supervisor.class);
//            List<Supervisor> list = nativeQuery.list();
//
//            for (Supervisor supervisor : list) {
//                System.out.println(supervisor);
//            }

            session.getTransaction().commit();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
        }
    }
}
