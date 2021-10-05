package aplicacao;

import domain.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Bruno", "bruno@deloitte.com");
        Pessoa p2 = new Pessoa(null, "MARIA", "maria@hotmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AulaTreino");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

//        em.persist(p1);
//        em.persist(p2);

            Pessoa p = em.find(Pessoa.class, 2);
            System.out.println(p);

            p.setEmail("maria@deloitte.com");
            em.persist(p);
            System.out.println(p);
            em.remove(p);

            em.getTransaction().commit();

        }finally {
        em.close();
        emf.close();
        }
    }

}
