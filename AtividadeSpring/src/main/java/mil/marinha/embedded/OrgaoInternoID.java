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
public class OrgaoInternoID implements Serializable {

    @Column(name = "CD_SUPE")
    private String cdSupe;
    @Column(name = "CD_DEPT")
    private String cdDept;
    @Column(name = "CD_DIVS")
    private String cdDivs;
    @Column(name = "CD_SCAO")
    private String cdScao;
    @Column(name = "CD_SETR")
    private String cdSetr;

}
