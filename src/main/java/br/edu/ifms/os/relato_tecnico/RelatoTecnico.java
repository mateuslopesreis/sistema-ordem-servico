/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relato_tecnico;

import br.edu.ifms.arch.BaseObject;
import br.edu.ifms.os.atendimento.Atendimento;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDate;
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
@SequenceGenerator(sequenceName = "relato_tecnico_sequence", name = "baseObjectSequence", allocationSize = 1)
public class RelatoTecnico extends BaseObject {
    
    private LocalDate dataFechamento;
    private String relato;
    
     @ManyToOne
    private Atendimento atendimento;
}
