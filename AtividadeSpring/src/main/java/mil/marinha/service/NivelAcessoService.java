package mil.marinha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import mil.marinha.domain.NivelAcesso;
import mil.marinha.repository.NivelAcessoRepository;

@Service
@RequiredArgsConstructor
public class NivelAcessoService {

    @Autowired
    private NivelAcessoRepository nivelAcessoRepository;

    public Page<NivelAcesso> listAll(Pageable pageable) {
        return nivelAcessoRepository.findAll(pageable);

    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

}
