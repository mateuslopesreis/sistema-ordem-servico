/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author mateu
 */
@RestController
@RequestMapping("/api/atendimento")
public class AtendimentoController extends AbstractSimpleController<Atendimento, AtendimentoId, AtendimentoDto, AtendimentoForm, AtendimentoRepository, AtendimentoService>{
     @Autowired
    @Override
    public void setService(AtendimentoService service) {
        super.service = service;
        super.setMapper(AtendimentoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Atendimento entity, UriComponentsBuilder uriBuilder) {
          Map<String, Long> map = new HashMap();
        var id = entity.getId();
        map.put("ordemservicoId", id.getOrdemservicoId());
        map.put("funcionarioId", id.getFuncionarioId());
        return uriBuilder.path("/api/atendimento/{ordemservicoId}/{funcionarioId}")
                .buildAndExpand(map)
                .toUri();
    }
}
