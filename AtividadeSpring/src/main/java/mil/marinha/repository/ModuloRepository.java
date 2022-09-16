package mil.marinha.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mil.marinha.domain.Modulo;
import mil.marinha.embedded.ModuloID;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, ModuloID> {

    Page<Modulo> findAll(Pageable pageable);

}
