/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.os.Cliente;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author mateu
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cliente não encontrada")

public class ClienteNotFoundException extends ResponseStatusException{
       public ClienteNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}
