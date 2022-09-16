package mil.marinha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import mil.marinha.domain.NivelAcesso;
import mil.marinha.service.NivelAcessoService;

@RestController
@RequestMapping("/acesso")
@RequiredArgsConstructor
public class NivelAcessoController {

    @Autowired
    private NivelAcessoService nivelAcessoService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<NivelAcesso>> findA() {
        return ResponseEntity.ok(nivelAcessoService.findAll());
    }

    @GetMapping(value = "/page")
    public ResponseEntity<Page<NivelAcesso>> listAll(Pageable pageable) {

        return ResponseEntity.ok(nivelAcessoService.listAll(pageable));
    }
}
