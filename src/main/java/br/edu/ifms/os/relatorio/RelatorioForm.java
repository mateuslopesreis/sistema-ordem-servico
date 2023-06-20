/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relatorio;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import br.edu.ifms.os.funcionario.FuncionarioDto;
import br.edu.ifms.os.ordem_servico.OrdemServicoDto;
import jakarta.validation.constraints.NotNull;
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
public class RelatorioForm extends AdapterBaseObjectForm{
    
     @NotNull
    private OrdemServicoDto ordemservico;
    
      @NotNull
    private FuncionarioDto funcionario;
      
      private String relatorio;
}
