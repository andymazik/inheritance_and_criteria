package lvl_15_inheritance.a_mapped_super_class;

import lvl_15_inheritance.a_mapped_super_class.entity.User;
import lvl_15_inheritance.a_mapped_super_class.entity.clients.Client;
import lvl_15_inheritance.a_mapped_super_class.entity.clients.Individual;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Individual.class)
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        try (sessionFactory; session){
            session.beginTransaction();

            Individual individual = new Individual(123, "Гвидон Вишневский", "ул. Цветочная д.6", LocalDate.now(),76873,LocalDate.of(1988,12,2));
            session.save(individual);

            session.getTransaction().commit();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
        }
    }
}
