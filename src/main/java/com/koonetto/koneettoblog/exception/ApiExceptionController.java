package com.koonetto.koneettoblog.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.List;

@RestControllerAdvice
public class ApiExceptionController {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiExceptionHandler> handleCommonApiException(ApiException exception) {
        List<String> errorMessages = List.of(exception.getMessage());

        return ResponseEntity.status(exception.getHttpStatus())
                .body(ApiExceptionHandler.builder().errorMessages(errorMessages).build());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiExceptionHandler> handleValidationException(MethodArgumentNotValidException exception) {
        List<String> errorMessages = exception.getBindingResult().getFieldErrors().stream()
                .map(FieldError::getDefaultMessage).toList();

        return ResponseEntity.status(exception.getStatusCode())
                .body(ApiExceptionHandler.builder().errorMessages(errorMessages).build());
    }
}
