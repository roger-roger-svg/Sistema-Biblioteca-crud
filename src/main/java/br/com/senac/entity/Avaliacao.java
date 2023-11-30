package br.com.senac.entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "avaliacoes")
public class Avaliacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2391017720248198648L;


	@EmbeddedId
	private AlunoDisciplina alunoDisciplina;
	
	
	private String conceito;

	public AlunoDisciplina getAlunoDisciplina() {
		return alunoDisciplina;
	}

	public void setAlunoDisciplina(AlunoDisciplina alunoDisciplina) {
		this.alunoDisciplina = alunoDisciplina;
	}

	public String getConceito() {
		return conceito;
	}

	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	
	
}