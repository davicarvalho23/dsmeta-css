package mil.marinha.embedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mil.marinha.domain.CodNivelAcesso;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NivelAcessID implements Serializable {

    @Column(name = "CD_PROJ")
    private String cdProj;
    @Column(name = "ID_MODU")
    private String IdModu;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
    @JoinColumn(name = "CD_NIVL_ACES", referencedColumnName = "CD_NIVL_ACES", nullable = false, insertable = false, updatable = false)
    private CodNivelAcesso codNivelAcesso;

}
