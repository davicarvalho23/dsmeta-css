package mil.marinha.embedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ModuloID implements Serializable {

    @Column(name = "CD_PROJ")
    private String cdProj;
    @Column(name = "ID_MODU")
    private String idModu;
}
