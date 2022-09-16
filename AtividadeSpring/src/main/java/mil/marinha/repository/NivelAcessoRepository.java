package mil.marinha.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mil.marinha.domain.NivelAcesso;
import mil.marinha.embedded.NivelAcessID;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, NivelAcessID> {

    Page<NivelAcesso> findAll(Pageable pageable);

}
