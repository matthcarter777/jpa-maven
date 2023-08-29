package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Mangabão", "manga@gmail.com");
		Pessoa p2 = new Pessoa(null, "Trevor", "trevin@gmail.com");
		Pessoa p3 = new Pessoa(null, "Jorge", "balao@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Ok");
	}

}
