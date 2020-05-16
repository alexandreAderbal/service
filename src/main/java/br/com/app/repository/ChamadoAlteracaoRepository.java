package br.com.app.repository;

import br.com.app.entity.ChamadoAlteracao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoAlteracaoRepository extends JpaRepository<ChamadoAlteracao,Long> {
}
