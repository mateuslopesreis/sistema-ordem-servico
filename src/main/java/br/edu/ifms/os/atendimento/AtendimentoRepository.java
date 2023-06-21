/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mateu
 */
@Repository

public interface AtendimentoRepository  extends IArchRepository<Atendimento, AtendimentoId>{
    
}
