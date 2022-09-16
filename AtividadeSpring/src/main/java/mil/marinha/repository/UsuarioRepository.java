package mil.marinha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mil.marinha.domain.Usuario;
import mil.marinha.dto.UsuarioDTO;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    // @Query("select user.CodNivelAcesso.descricao from NivelAcesso user where
    // user.Cdproj = ? and user.Idmodu = ?")
    // List<Usuario> user();

    @Query("select new mil.marinha.dto.UsuarioDTO(u.cpf1.cpf2.cpf3.idcpf.cdSupe.cdDept.cdDivs.cdScao.cdSetr")
    List<UsuarioDTO> encontrarUsuario();
}
