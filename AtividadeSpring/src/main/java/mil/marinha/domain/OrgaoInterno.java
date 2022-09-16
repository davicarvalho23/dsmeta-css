package mil.marinha.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mil.marinha.embedded.OrgaoInternoID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EEVU_AM")
public class OrgaoInterno {

  @EmbeddedId
  private OrgaoInternoID orgaoInternoIDs;

  @Column(name = "DE_AM")
  private String descricaoAM;

}
