package criteria_api;

import criteria_api.entity.Supervisor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

@SuppressWarnings("ALL")
public class UpdateDeleteRunner {
    static final SessionFactory sessionFactory =  new Configuration().addAnnotatedClass(Supervisor.class).buildSessionFactory();
    static final Session session = sessionFactory.openSession();

    public static void main(String[] args) throws IllegalAccessException {


        try (sessionFactory; session) {
            session.beginTransaction();

            //UPDATE
//            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//            CriteriaUpdate<Supervisor> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Supervisor.class);
//            Root<Supervisor> root = criteriaUpdate.from(Supervisor.class);
//            criteriaUpdate.set(root.get("id"), 777).where(criteriaBuilder.lessThan(root.get("id"), 22));
//
//            session.createQuery(criteriaUpdate).executeUpdate();


            //DELETE
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); //построитель критериев
            CriteriaDelete<Supervisor> criteriaDelete = criteriaBuilder.createCriteriaDelete(Supervisor.class);//построитель запроса  clause: select, from, where....
            Root<Supervisor> root = criteriaDelete.from(Supervisor.class);
            criteriaDelete.where(criteriaBuilder.equal(root.get("id"), 12));

            session.createQuery(criteriaDelete).executeUpdate();

            session.getTransaction().commit();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
        }





    }
}
