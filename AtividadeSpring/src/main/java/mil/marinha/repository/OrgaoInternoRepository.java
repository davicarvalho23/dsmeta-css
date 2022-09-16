package mil.marinha.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mil.marinha.domain.OrgaoInterno;
import mil.marinha.embedded.OrgaoInternoID;

@Repository
public interface OrgaoInternoRepository extends JpaRepository<OrgaoInterno, OrgaoInternoID> {

    Page<OrgaoInterno> findAll(Pageable pageable);
}
