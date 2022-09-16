package mil.marinha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mil.marinha.domain.Usuario;
import mil.marinha.dto.UsuarioDTO;
import mil.marinha.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public List<UsuarioDTO> encontrarUsuarioDTOs() {
        return usuarioRepository.encontrarUsuario();
    }

    public UsuarioDTO converterUsuarioParaUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        // usuarioDTO.setCpf1(usuario.class);
        return null;

    }

}
