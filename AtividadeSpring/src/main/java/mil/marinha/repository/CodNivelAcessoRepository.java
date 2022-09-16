package mil.marinha.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import mil.marinha.domain.CodNivelAcesso;

public interface CodNivelAcessoRepository extends JpaRepository<CodNivelAcesso, Integer> {

    Page<CodNivelAcesso> findAll(Pageable pageable);

    /* @Query("select obj from CodNivelAcesso") */
}
