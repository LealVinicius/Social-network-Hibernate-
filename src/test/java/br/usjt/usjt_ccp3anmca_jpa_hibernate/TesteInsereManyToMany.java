package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Consumo;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Conteudo;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Perfil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Usuario;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.repository.JPAUtil;

public class TesteInsereManyToMany {
	public static void main(String[] args) {
		EntityManager manager= JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		/*Comentado para o passo 5
		List<Conteudo> conteudos = new ArrayList<>();
		Conteudo c1 = new Conteudo();
		c1.setDescricao("conteudo 1");
		c1.setTipo("Tipo 1");
		Conteudo c2 = new Conteudo();
		c2.setDescricao("conteudo 2");
		c2.setTipo("Tipo 2");
		conteudos.add(c1);
		conteudos.add(c2);
		Usuario u1 = new Usuario();
		Perfil perfil = new Perfil();
		perfil.setDescricao("perfil do João");
		perfil.setUsuario(u1);
		u1.setNome("João");
		u1.setFone("12321131");
		u1.setEmail("joao@usjt.br");
		u1.setPerfil(perfil);
		u1.setConteudos(conteudos);
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(u1);
		c1.setUsuarios(usuarios);
		c2.setUsuarios(usuarios);
		manager.persist(u1);*/
		Usuario u = new Usuario ();
		u.setNome("Ana");
		u.setFone("11223344");
		u.setEmail("ana@usjt.br");
		Perfil p = new Perfil();
		p.setDescricao("Perfil da Ana");
		p.setUsuario(u);
		u.setPerfil(p);
		Conteudo conteudo = new Conteudo ();
		conteudo.setDescricao("Conteúdo consumido pela Ana");
		conteudo.setTipo("Conteúdo do tipo texto");
		Consumo consumo = new Consumo();
		consumo.setDataHora(new Date());
		consumo.setUsuario(u);
		consumo.setConteudo(conteudo);
		manager.persist(consumo);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}