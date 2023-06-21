/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.arch.BaseObject;
import br.edu.ifms.os.funcionario.Funcionario;
import br.edu.ifms.os.ordem_servico.OrdemServico;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author mateu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@SequenceGenerator(sequenceName = "atendimento_sequence", name = "baseObjectSequence", allocationSize = 1)

public class Atendimento implements Serializable{
    
    @EmbeddedId
    private AtendimentoId id;
    
    @ManyToOne
    @JoinColumn(name = "funcionario_id",
            insertable = false,
            updatable = false)
    private  Funcionario funcionario;
    
    @ManyToOne
    @JoinColumn(name = "ordem_servico_id",
            insertable = false,
            updatable = false)
    private  OrdemServico ordemservico;
     
     @Column(nullable = false)
    private LocalDate dataAbertura;
     
     

}
