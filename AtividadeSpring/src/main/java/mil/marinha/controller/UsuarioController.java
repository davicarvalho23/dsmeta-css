package mil.marinha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import mil.marinha.domain.Usuario;
import mil.marinha.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> result = usuarioService.findAll();
        return ResponseEntity.ok(result);
    }

    // @GetMapping(value = "/page")
    // public ResponseEntity<Page<Usuario>> find(Pageable pageable) {
    // Page<Pessoa> result = pessoaService.listAll(pageable);
    // return ResponseEntity.ok(result);
    // }

}
