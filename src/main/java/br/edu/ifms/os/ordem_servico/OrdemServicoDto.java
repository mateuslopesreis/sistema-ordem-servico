/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.ordem_servico;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import br.edu.ifms.os.Cliente.ClienteDto;
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
public class OrdemServicoDto extends AdapterBaseObjectDto{
    private LocalDate dataAbertura;
    private String problema;
    private String prioridade;
    private String status;
    
    private String nomeClientes;
}
