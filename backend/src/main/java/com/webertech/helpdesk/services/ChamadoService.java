package com.webertech.helpdesk.services;

import com.webertech.helpdesk.domain.Chamado;
import com.webertech.helpdesk.repositories.ChamadoRepository;
import com.webertech.helpdesk.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository repository;

    public Chamado findbyId(Integer id) {
        Optional<Chamado> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID -> " + id));
    }

    public List<Chamado> findAll() {
        return repository.findAll();
    }
}
