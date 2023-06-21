/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relatorio_tecnico;

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
@RequestMapping("/api/relatorio-tecnico")
public class RelatorioTecnicoController extends AbstractSimpleController<RelatorioTecnico, Long, RelatorioTecnicoDto, RelatorioTecnicoForm, RelatorioTecnicoRepository, RelatorioTecnicoService>  {
    
    @Autowired
    @Override
    public void setService(RelatorioTecnicoService service) {
        super.service = service;
        super.setMapper(RelatorioTecnicoMapper.INSTANCE);
    }

    @Override
    public URI createUri(RelatorioTecnico entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/relatorio-tecnico/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
