package org.lidem.cfa.garagejee.service;

import org.lidem.cfa.garagejee.model.Employe;
import java.util.List;
import javax.persistence.*;


public class EmployeService {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EmployeService() {
        emf = Persistence.createEntityManagerFactory("garagejee");
        em = emf.createEntityManager();
    }

    public List<Employe> findAll() {
        return em.createQuery("SELECT e FROM Employe e", Employe.class).getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
    public void save(Employe employe) {
        em.getTransaction().begin();
        em.persist(employe);
        em.getTransaction().commit();
    }
}
