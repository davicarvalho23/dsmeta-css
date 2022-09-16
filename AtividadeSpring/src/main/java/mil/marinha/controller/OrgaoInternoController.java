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
import mil.marinha.domain.OrgaoInterno;
import mil.marinha.repository.OrgaoInternoRepository;

@RestController
@RequestMapping("/oi")
@RequiredArgsConstructor
@AllArgsConstructor
public class OrgaoInternoController {
    @Autowired
    OrgaoInternoRepository orgaoInternoRepository;

    @GetMapping(value = "/all")
    public List<OrgaoInterno> findA() {

        return orgaoInternoRepository.findAll();
    }

    @GetMapping(value = "/page")
    public ResponseEntity<Page<OrgaoInterno>> findAll(Pageable pageable) {
        Page<OrgaoInterno> result = orgaoInternoRepository.findAll(pageable);
        return ResponseEntity.ok(result);

    }
}
