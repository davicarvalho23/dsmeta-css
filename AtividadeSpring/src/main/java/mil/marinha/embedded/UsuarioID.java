package mil.marinha.embedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mil.marinha.domain.NivelAcesso;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioID implements Serializable {

    @Column(name = "NR_CPF_FUNC_01")
    private String cpf1;

    @Column(name = "NR_CPF_FUNC_02")
    private String cpf2;

    @Column(name = "NR_CPF_FUNC_03")
    private String cpf3;

    @Column(name = "ID_DV_CPF_FUNC")
    private String idcpf;

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

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "CD_PROJ", referencedColumnName = "CD_PROJ", insertable = false, nullable = false, updatable = false),
            @JoinColumn(name = "ID_MODU", referencedColumnName = "ID_MODU", insertable = false, nullable = false, updatable = false),
            @JoinColumn(name = "CD_NIVL_ACES", referencedColumnName = "CD_NIVL_ACES", insertable = false, nullable = false, updatable = false)
    })
    private NivelAcesso nivelAcesso;
}
