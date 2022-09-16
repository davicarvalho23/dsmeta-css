package mil.marinha.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ADVU_CODI_NIVL_ACES")
public class CodNivelAcesso {

    @Id
    @Column(name = "CD_NIVL_ACES")
    private Integer cdNivlAces;

}
