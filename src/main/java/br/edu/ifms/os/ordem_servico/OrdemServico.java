/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.ordem_servico;

import br.edu.ifms.arch.BaseObject;
import br.edu.ifms.os.Cliente.Cliente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@SequenceGenerator(sequenceName = "ordem_servico_sequence", name = "baseObjectSequence", allocationSize = 1)
public class OrdemServico extends BaseObject{
    
    private String problema;
    
    @Column(columnDefinition = "varchar(255) not null")
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;
    
    @Column(columnDefinition = "varchar(255) not null")
    @Enumerated(EnumType.STRING)
    private Status status;
    
     @ManyToOne
    private Cliente clientes;
}
