/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relatorio_tecnico;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mateu
 */
@Service
public class RelatorioTecnicoService extends AbstractService<RelatorioTecnico, Long, RelatorioTecnicoForm, RelatorioTecnicoRepository>  {
    @Autowired
    @Override
    public void setRepository(RelatorioTecnicoRepository repository){
         super.repository = repository;
        super.setMapper(RelatorioTecnicoMapper.INSTANCE);
    }
}
