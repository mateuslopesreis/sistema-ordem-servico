/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import br.edu.ifms.os.funcionario.Funcionario;
import br.edu.ifms.os.ordem_servico.OrdemServico;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 *
 * @author mateu
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class AtendimentoDto{
    
    private String nomeordemservico;
    private String nomefuncionario;
    private LocalDate dataAbertura;
}
