package br.com.treinaweb.adoteumpet.api.common.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorReponse {

    private int status;
    private String error;
    private String cause;
    private String message;
    private LocalDateTime timestamp;
    
}
