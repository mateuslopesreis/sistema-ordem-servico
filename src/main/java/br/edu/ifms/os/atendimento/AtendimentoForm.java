/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import br.edu.ifms.os.funcionario.FuncionarioDto;
import br.edu.ifms.os.ordem_servico.OrdemServicoDto;
import jakarta.validation.constraints.NotNull;
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
public class AtendimentoForm{
    
    
    private OrdemServicoDto ordemservico;
    
    
     
    private FuncionarioDto funcionario;
      
    private LocalDate dataAbertura;

}
