/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relatorio;

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
@RequestMapping("/api/relatorio")
public class RelatorioController extends AbstractSimpleController<Relatorio, Long, RelatorioDto, RelatorioForm, RelatorioRepository, RelatorioService>{
     @Autowired
    @Override
    public void setService(RelatorioService service) {
        super.service = service;
        super.setMapper(RelatorioMapper.INSTANCE);
    }

    @Override
    public URI createUri(Relatorio entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/relatorio/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
