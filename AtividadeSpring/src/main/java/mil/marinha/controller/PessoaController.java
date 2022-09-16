package mil.marinha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import mil.marinha.domain.Pessoa;
import mil.marinha.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
@AllArgsConstructor
public class PessoaController {

    // private final CevuAMService cevuAMService;
    @Autowired
    private PessoaService pessoaService;

    // private PessoaRepository pessoaRepository;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Pessoa>> findAll() {
        List<Pessoa> result = pessoaService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/page")
    public ResponseEntity<Page<Pessoa>> find(Pageable pageable) {
        Page<Pessoa> result = pessoaService.listAll(pageable);
        return ResponseEntity.ok(result);
    }

}
