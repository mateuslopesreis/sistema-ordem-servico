/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.relato_tecnico;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author mateu
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Relatório Técnico não encontrada")

public class RelatoTecnicoNotFoundException extends ResponseStatusException{
      public RelatoTecnicoNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}
