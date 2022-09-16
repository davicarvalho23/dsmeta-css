package mil.marinha.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mil.marinha.embedded.PessoaID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ADVU_PESS")
public class Pessoa {

    @EmbeddedId
    private PessoaID id;

    @Column(name = "NR_CPF_FUNC_01")
    private String cpf1;

    @Column(name = "NR_CPF_FUNC_02")
    private String cpf2;

    @Column(name = "NR_CPF_FUNC_03")
    private String cpf3;

    @Column(name = "ID_DV_CPF_FUNC")
    private String idcpf;

    @Column(name = "NM_FUNC")
    private String nmfunc;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "CD_SUPE", referencedColumnName = "CD_SUPE", insertable = false, nullable = false, updatable = false),
            @JoinColumn(name = "CD_DEPT", referencedColumnName = "CD_DEPT", insertable = false, nullable = false, updatable = false),
            @JoinColumn(name = "CD_DIVS", referencedColumnName = "CD_DIVS", insertable = false, nullable = false, updatable = false),
            @JoinColumn(name = "CD_SCAO", referencedColumnName = "CD_SCAO", insertable = false, nullable = false, updatable = false),
            @JoinColumn(name = "CD_SETR", referencedColumnName = "CD_SETR", insertable = false, nullable = false, updatable = false)
    })
    private OrgaoInterno orgaoInterno;

}
