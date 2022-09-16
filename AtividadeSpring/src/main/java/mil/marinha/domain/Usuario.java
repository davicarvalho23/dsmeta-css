package mil.marinha.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mil.marinha.embedded.UsuarioID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ADVU_NIVL_ACES_USUA")
public class Usuario {

    @EmbeddedId
    private UsuarioID usuarioID;

}
