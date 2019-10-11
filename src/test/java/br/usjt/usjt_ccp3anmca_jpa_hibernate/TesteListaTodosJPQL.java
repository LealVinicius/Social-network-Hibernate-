package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;

import com.mysql.cj.Query;

import antlr.collections.List;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Usuario;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.repository.JPAUtil;

public class TesteListaTodosJPQL {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Usuario");
		List<Usuario> usuarios = query.getResultList();
		for (Usuario u : usuarios) {
			System.out.println(u);
		}
		manager.close();
		JPAUtil.close();
	}
}