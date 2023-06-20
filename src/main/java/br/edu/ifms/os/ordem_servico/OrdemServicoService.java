/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.ordem_servico;
import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mateu
 */
@Service
public class OrdemServicoService extends AbstractService<OrdemServico, Long, OrdemServicoForm, OrdemServicoRepository> {
    @Autowired
    @Override
    public void setRepository(OrdemServicoRepository repository){
         super.repository = repository;
        super.setMapper(OrdemServicoMapper.INSTANCE);
    }
}
