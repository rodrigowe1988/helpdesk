package com.webertech.helpdesk.services;

import com.webertech.helpdesk.domain.Tecnico;
import com.webertech.helpdesk.repositories.TecnicoRepository;
import com.webertech.helpdesk.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado -> ID:" + id));
    }

    public List<Tecnico> findAll() {
        return repository.findAll();
    }
}
