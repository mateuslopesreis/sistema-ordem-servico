/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.ordem_servico;

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
@RequestMapping("/api/ordem-servico")
public class OrdemServicoController extends AbstractSimpleController<OrdemServico, Long, OrdemServicoDto, OrdemServicoForm, OrdemServicoRepository, OrdemServicoService>{
     @Autowired
    @Override
    public void setService(OrdemServicoService service) {
        super.service = service;
        super.setMapper(OrdemServicoMapper.INSTANCE);
    }

    @Override
    public URI createUri(OrdemServico entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/OrdemServico/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
