/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relato_tecnico;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import br.edu.ifms.os.atendimento.AtendimentoDto;
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
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RelatoTecnicoForm extends AdapterBaseObjectForm {
    private LocalDate dataFechamento;
    private String relato;
    private AtendimentoDto atendimento;
}
