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
import mil.marinha.domain.Modulo;
import mil.marinha.repository.ModuloRepository;

@RestController
@RequestMapping("/modulo")
@RequiredArgsConstructor
@AllArgsConstructor
public class ModuloController {

    @Autowired
    private ModuloRepository moduloRepository;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Modulo>> findAll() {
        List<Modulo> result = moduloRepository.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/page")
    public ResponseEntity<Page<Modulo>> find(Pageable pageable) {
        Page<Modulo> result = moduloRepository.findAll(pageable);
        return ResponseEntity.ok(result);
    }

}
