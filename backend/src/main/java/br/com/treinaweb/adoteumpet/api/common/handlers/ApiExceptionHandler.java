package br.com.treinaweb.adoteumpet.api.common.handlers;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.treinaweb.adoteumpet.api.common.dtos.ErrorReponse;

@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
        MethodArgumentNotValidException exception,
        HttpHeaders headers,
        HttpStatus status,
        WebRequest request
        ) {
            var body = ErrorReponse.builder()
            .status(status.value())
            .error(status.getReasonPhrase())
            .cause(exception.getClass().getSimpleName())
            .message("Houveram erros de validação")
            .timestamp(LocalDateTime.now())
            .build();
        return new ResponseEntity<>(body, status);
    }

}

