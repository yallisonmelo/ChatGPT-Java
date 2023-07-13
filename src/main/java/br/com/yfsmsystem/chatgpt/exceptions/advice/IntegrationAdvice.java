package br.com.yfsmsystem.chatgpt.exceptions.advice;

import br.com.yfsmsystem.chatgpt.exceptions.IntegrationException;
import br.com.yfsmsystem.chatgpt.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class IntegrationAdvice {

    @ExceptionHandler(IntegrationException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    ErrorResponse userNotFoundHandler(IntegrationException ex) {
        ErrorResponse error = new ErrorResponse();
        error.setCode(String.valueOf(HttpStatus.UNPROCESSABLE_ENTITY.value()));
        error.setType(ex.getMessage());
        error.setType(ex.getMessage());
        return error;
    }
}
