/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.funcionario;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import br.edu.ifms.arch.repository.IArchRepository;
import br.edu.ifms.arch.service.IService;
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
@RequestMapping("/api/funcionario")
public class FuncionarioController extends AbstractSimpleController<Funcionario, Long, FuncionarioDto, FuncionarioForm, FuncionarioRepository, FuncionarioService> {
     @Autowired
    @Override
    public void setService(FuncionarioService service) {
        super.service = service;
        super.setMapper(FuncionarioMapper.INSTANCE);
    }

    @Override
    public URI createUri(Funcionario entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/funcionario/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
