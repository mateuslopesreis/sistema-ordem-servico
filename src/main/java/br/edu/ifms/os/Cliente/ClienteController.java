/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.Cliente;
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
@RequestMapping("/api/cliente")
public class ClienteController extends AbstractSimpleController<Cliente, Long, ClienteDto, ClienteForm, ClienteRepository, ClienteService> {
      @Autowired
    @Override
    public void setService(ClienteService service) {
        super.service = service;
        super.setMapper(ClienteMapper.INSTANCE);
    }

    @Override
    public URI createUri(Cliente entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/Cliente/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
