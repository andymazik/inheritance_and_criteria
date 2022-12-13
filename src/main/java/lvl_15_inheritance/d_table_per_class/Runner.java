package lvl_15_inheritance.d_table_per_class;

import lvl_15_inheritance.d_table_per_class.entity.Client;
import lvl_15_inheritance.d_table_per_class.entity.Manager;
import lvl_15_inheritance.d_table_per_class.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Manager.class)
                .addAnnotatedClass(Client.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        try (sessionFactory; session){
            session.beginTransaction();

//            Manager manager1 = new Manager(14, "Козьма Борисович", LocalDate.of(1996, 3, 12), "Менеджер", 100500, LocalDate.of(2013, 11, 5));
//            Manager manager2 = new Manager(19, "Плутарх Аристархович", LocalDate.of(1990, 3, 10), "Супервайзер", 100500, LocalDate.of(2015, 1, 5));
//            Client client1 = new Client(12, "Иван Денисович", LocalDate.now(),"ул. Лесная, д.45");
//            Client client2 = new Client(20, "Эрнест Иванович", LocalDate.now(),"ул. Чусовая, д.11, кв.26");
//
//            User user1 = new User(15, "Дориан Евлампиевич", LocalDate.of(1985, 10, 13));
//            User user2 = new User(16, "Карим Эргашевич", LocalDate.of(1981, 12, 10));
//            User user3 = new User(17, "Дитрих Калошевич", LocalDate.of(1991, 3, 2));
//
//
//            session.persist(manager1);
//            session.persist(manager2);
//            session.persist(client1);
//            session.persist(client2);
//            session.persist(user1);
//            session.persist(user2);
//            session.persist(user3);

            Query<User> users = session.createQuery("select usr from User usr where usr.id < 15", User.class);
            List<User> list = users.list();
            for (User user : list) {
                System.out.println(user);
            }

            session.getTransaction().commit();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
        }
    }
}
