package mil.marinha.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mil.marinha.embedded.NivelAcessID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ADVU_NIVL_ACES")
@Entity
public class NivelAcesso {

    @EmbeddedId
    private NivelAcessID nivelAcessIDs;

}
