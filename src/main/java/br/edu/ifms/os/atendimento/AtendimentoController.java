/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.AlternativeJdkIdGenerator;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author mateu
 */
@RestController
@RequestMapping("/api/atendimento")
public class AtendimentoController extends AbstractSimpleController<Atendimento, AtendimentoId, AtendimentoDto, AtendimentoForm, AtendimentoRepository, AtendimentoService> {

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

    @GetMapping("/ordemservicoId/funcionarioId")
    public ResponseEntity<AtendimentoDto> visualizar(
            @PathVariable Long ordemservicoId, 
            @PathVariable Long funcionarioId) {
        AtendimentoId id = AtendimentoId.builder()
                .ordemservicoId(ordemservicoId)
                .funcionarioId(funcionarioId)
                .build();
        return super.visualizar(id);
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    @GetMapping("/notfound")
    public ResponseEntity<AtendimentoDto> visualizar(AtendimentoId id) {
        return super.visualizar(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    //excluir alterar

    @DeleteMapping("/ordemservicoId/funcionarioId")
    public ResponseEntity<?> remover(@PathVariable Long ordemservicoId, @PathVariable Long funcionarioId) {
        AtendimentoId id = AtendimentoId.builder()
                .ordemservicoId(ordemservicoId)
                .funcionarioId(funcionarioId)
                .build();
        return super.remover(id); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @PutMapping("/ordemservicoId/funcionarioId")
    public ResponseEntity<AtendimentoDto> atualizar(@PathVariable Long ordemservicoId, @PathVariable Long funcionarioId,  @RequestBody @Valid AtendimentoForm form) {
        AtendimentoId id = AtendimentoId.builder()
                .ordemservicoId(ordemservicoId)
                .funcionarioId(funcionarioId)
                .build();
        
        return super.atualizar(id, form); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    

}
