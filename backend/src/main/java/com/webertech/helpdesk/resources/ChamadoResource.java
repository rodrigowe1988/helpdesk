package com.webertech.helpdesk.resources;

import com.webertech.helpdesk.domain.Chamado;
import com.webertech.helpdesk.domain.dtos.ChamadoDTO;
import com.webertech.helpdesk.services.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/chamados")
public class ChamadoResource {

    @Autowired
    private ChamadoService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ChamadoDTO> findbyId(@PathVariable Integer id) {
        Chamado obj = service.findbyId(id);
        return ResponseEntity.ok().body(new ChamadoDTO(obj));
    }
}
