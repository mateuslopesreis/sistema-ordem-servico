/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.os.funcionario.Funcionario;
import br.edu.ifms.os.ordem_servico.OrdemServico;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
