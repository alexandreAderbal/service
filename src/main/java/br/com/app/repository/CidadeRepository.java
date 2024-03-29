package br.com.app.repository;

import br.com.app.entity.Cidade;
import br.com.app.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Long> {

    List<Cidade> findByEstado(Estado estado);

}
