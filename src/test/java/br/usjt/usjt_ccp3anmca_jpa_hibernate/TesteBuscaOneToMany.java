package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Feedback;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.repository.JPAUtil;

public class TesteBuscaOneToMany {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Feedback f = manager.find(Feedback.class, 14L);
		System.out.println(f.getConsumos());
		manager.close();
		JPAUtil.close();
	}
}