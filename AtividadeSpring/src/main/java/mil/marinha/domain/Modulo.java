package mil.marinha.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mil.marinha.embedded.ModuloID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ADVU_MODU")
public class Modulo {

    @EmbeddedId
    private ModuloID moduloIDs;

    @Column(name = "DE_MODU")
    private String deModu;

}
