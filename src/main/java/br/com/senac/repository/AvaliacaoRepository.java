package br.com.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.entity.AlunoDisciplina;
import br.com.senac.entity.Avaliacao;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, AlunoDisciplina>{

	Avaliacao findByAlunoDisciplina(AlunoDisciplina alunoDisciplica);
	
}