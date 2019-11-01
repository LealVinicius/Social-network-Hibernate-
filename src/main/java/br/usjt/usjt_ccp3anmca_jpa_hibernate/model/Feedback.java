package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_feedback")
@Getter
@Setter
@ToString
public class Feedback {
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<Consumo> getConsumos() {
		return consumos;
	}


	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}


	@OneToMany(mappedBy = "feedback", cascade = CascadeType.ALL) 
	// ao colocar o cascadeType.ALL tb_consumo
	// também é preenchido no TesteInsereDoisConsumosUmFeedBack
	private List<Consumo> consumos;
}