/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.atendimento;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author mateu
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Atendimento não encontrada")

public class AtendimentoNotFoundException  extends ResponseStatusException {
     public AtendimentoNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}
