package mil.marinha.dto;

import lombok.Data;

@Data
public class UsuarioDTO {

    private String cpf1;

    private String cpf2;

    private String cpf3;

    private String idcpf;

    private String cdSupe;

    private String cdDept;

    private String cdDivs;

    private String cdScao;

    private String cdSetr;

    public UsuarioDTO(String cpf1, String cpf2, String cpf3, String idcpf, String cdSupe, String cdDept, String cdDivs,
            String cdScao, String cdSetr) {
        this.cpf1 = cpf1;
        this.cpf2 = cpf2;
        this.cpf3 = cpf3;
        this.idcpf = idcpf;
        this.cdSupe = cdSupe;
        this.cdDept = cdDept;
        this.cdDivs = cdDivs;
        this.cdScao = cdScao;
        this.cdSetr = cdSetr;
    }

    public UsuarioDTO() {
    }

}
