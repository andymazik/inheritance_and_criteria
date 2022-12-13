package lvl_15_inheritance.c_joined_table;

import lvl_15_inheritance.c_joined_table.entity.Client;
import lvl_15_inheritance.c_joined_table.entity.Employee;
import lvl_15_inheritance.c_joined_table.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        try (sessionFactory; session){
            session.beginTransaction();

            Employee employee = new Employee(14, "Козьма Борисович", LocalDate.of(1996, 3, 12), "Менеджер", 100500, LocalDate.of(2013, 11, 5));
            Client client = new Client(12, "Иван Денисович", LocalDate.now(),"ул. Лесная, д.45");
            //Не забываем ставить уникальные ключи. И хотя на уровне таблицы primary_key не установлен,
            // hibernate под капотом записывает толко с уникальными ключами.
            User user1 = new User(15, "Дориан Евлампиевич", LocalDate.of(1985, 10, 13));
            User user2 = new User(16, "Карим Эргашевич", LocalDate.of(1981, 12, 10));
            User user3 = new User(17, "Дитрих Калошевич", LocalDate.of(1991, 3, 2));

            session.persist(employee);
            session.persist(client);
            session.persist(user1);
            session.persist(user2);
            session.persist(user3);

            session.getTransaction().commit();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
        }
    }
}
