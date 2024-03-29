/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relato_tecnico;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import br.edu.ifms.os.atendimento.Atendimento;
import br.edu.ifms.os.atendimento.AtendimentoDto;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author mateu
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class RelatoTecnicoDto extends AdapterBaseObjectDto {
    
    private LocalDate dataFechamento;
    private String relato;
    
    private AtendimentoDto atendimento;
}
