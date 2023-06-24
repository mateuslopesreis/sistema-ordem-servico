/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relato_tecnico;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author mateu
 */
@RestController
@RequestMapping("/api/relato-tecnico")
public class RelatoTecnicoController extends AbstractSimpleController<RelatoTecnico, Long, RelatoTecnicoDto, RelatoTecnicoForm, RelatoTecnicoRepository, RelatoTecnicoService>  {
    
    @Autowired
    @Override
    public void setService(RelatoTecnicoService service) {
        super.service = service;
        super.setMapper(RelatoTecnicoMapper.INSTANCE);
    }

    @Override
    public URI createUri(RelatoTecnico entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/relato-tecnico/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
