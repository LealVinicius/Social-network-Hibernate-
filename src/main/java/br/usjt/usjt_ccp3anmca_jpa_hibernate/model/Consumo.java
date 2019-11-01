package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_consumo")
@Getter
@Setter
public class Consumo {
	@Id
	@GeneratedValue
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Conteudo conteudo;
	
	private Long id;

	private Date dataHora;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	// Comentar Passo 5
	@ManyToOne
	private Feedback feedback;
	
	@ManyToOne(cascade = CascadeType.ALL) // Cascade necessário para o passo 5
	private Conteudo conteudo;

	@ManyToOne(cascade = CascadeType.ALL) // Cascade necessário para o passo 5
	private Usuario usuario;


}