package mil.marinha.embedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaID implements Serializable {

    @Column(name = "NR_NIP")
    private Integer nrNip;

    @Column(name = "CD_NIND")
    private String cdNind;

}
