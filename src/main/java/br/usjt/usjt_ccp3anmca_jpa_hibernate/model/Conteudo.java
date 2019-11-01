package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_conteudo")
@Getter @Setter
public class Conteudo {
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	private String tipo;
	
	
	/*Comentado para o passo 5
	@ManyToMany
	private List<Usuario> usuarios;
	*/
	
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


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public List<Consumo> getConsumos() {
		return consumos;
	}


	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}


	@OneToMany(mappedBy = "conteudo")
	private List<Consumo> consumos;
}
