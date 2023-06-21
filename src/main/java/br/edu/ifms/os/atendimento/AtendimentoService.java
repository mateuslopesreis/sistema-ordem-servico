/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mateu
 */
@Service

public class AtendimentoService extends AbstractService<Atendimento, AtendimentoId, AtendimentoForm, AtendimentoRepository> {
     
    @Autowired
    @Override
    public void setRepository(AtendimentoRepository repository){
         super.repository = repository;
        super.setMapper(AtendimentoMapper.INSTANCE);
    }
}
