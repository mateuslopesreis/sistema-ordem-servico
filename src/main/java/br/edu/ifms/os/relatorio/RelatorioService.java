/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relatorio;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mateu
 */
@Service

public class RelatorioService extends AbstractService<Relatorio, Long, RelatorioForm, RelatorioRepository> {
     
    @Autowired
    @Override
    public void setRepository(RelatorioRepository repository){
         super.repository = repository;
        super.setMapper(RelatorioMapper.INSTANCE);
    }
}
