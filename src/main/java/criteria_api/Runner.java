package criteria_api;

import criteria_api.entity.Supervisor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@SuppressWarnings("ALL")
public class Runner {
    static final SessionFactory sessionFactory =  new Configuration().addAnnotatedClass(Supervisor.class).buildSessionFactory();
    static final Session session = sessionFactory.openSession();

    public static void main(String[] args) throws IllegalAccessException {
        try (sessionFactory; session) {
            session.beginTransaction();

//            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); //построитель критериев
//            CriteriaQuery<Supervisor> criteriaQuery = criteriaBuilder.createQuery(Supervisor.class); //построитель запроса  clause: select, from, where....
//            Root<Supervisor> root = criteriaQuery.from(Supervisor.class); //"корневая структура" сущности (из оф.доки: "объект метамодели, соответствующий корню")

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); //построитель критериев
            CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class); //построитель запроса  clause: select, from, where....
            Root<Supervisor> root = criteriaQuery.from(Supervisor.class);

            //criteriaQuery.select(criteriaBuilder.avg(root.get("salary")));
            criteriaQuery.select(criteriaBuilder.count(root));

//            Predicate salary = criteriaBuilder.gt(root.get("salary"), 5000);
//            Predicate experience = criteriaBuilder.lt(root.get("experience"), 16);
//            Predicate supv = criteriaBuilder.equal(root.get("title"), "Супервайзер");

            //criteriaQuery.select(root)
                    //.where(criteriaBuilder.lt(root.get("experience"), 10));
                    //.where(criteriaBuilder.gt(root.get("salary"), 5000))
                    //.where(criteriaBuilder.between(root.get("experience"), 5, 20));
                    //.where(criteriaBuilder.isNull(root.get("title")));
                    //.where(criteriaBuilder.like(root.get("title"), "Старший%"));
                    //.where(criteriaBuilder.equal(root.get("salary"), 0));
                    //.orderBy(criteriaBuilder.asc(root.get("salary")));

                    //.where(criteriaBuilder.and(salary, experience, supv));

            Query<Long> query = session.createQuery(criteriaQuery);
            Long singleResult = query.getSingleResult();
            System.out.println(singleResult);
//            List<Supervisor> list = query.list();
//            for (Supervisor supervisor : list) {
//                System.out.println(supervisor);
//            }


            session.getTransaction().commit();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
        }





    }
}
