/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relato_tecnico;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mateu
 */
@Service
public class RelatoTecnicoService extends AbstractService<RelatoTecnico, Long, RelatoTecnicoForm, RelatoTecnicoRepository>  {
    @Autowired
    @Override
    public void setRepository(RelatoTecnicoRepository repository){
         super.repository = repository;
        super.setMapper(RelatoTecnicoMapper.INSTANCE);
    }
}
