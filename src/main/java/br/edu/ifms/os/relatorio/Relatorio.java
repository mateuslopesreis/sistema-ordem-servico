/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relatorio;

import br.edu.ifms.arch.BaseObject;
import br.edu.ifms.os.funcionario.Funcionario;
import br.edu.ifms.os.ordem_servico.OrdemServico;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author mateu
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "relatorio_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Relatorio extends BaseObject{
    
    
     @ManyToOne
    private Funcionario funcionario;
     
      @ManyToOne
    private OrdemServico ordemservico;
     
     private String relatorio;
}
