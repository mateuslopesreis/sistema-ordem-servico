/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.ordem_servico;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import br.edu.ifms.os.Cliente.ClienteDto;
import jakarta.validation.constraints.NotNull;
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
public class OrdemServicoForm extends AdapterBaseObjectForm{

    private String problema;
    private Prioridade prioridade;
    private Status status;
    
    @NotNull
    public ClienteDto clientes;
}
