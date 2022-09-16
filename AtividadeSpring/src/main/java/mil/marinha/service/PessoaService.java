package mil.marinha.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import mil.marinha.domain.Pessoa;
import mil.marinha.repository.PessoaRepository;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public Page<Pessoa> listAll(Pageable pageable) {
        return pessoaRepository.findAll(pageable);

    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

}
