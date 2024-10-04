package com.koonetto.koneettoblog.exception;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiExceptionHandler {

    private List<String> errorMessages;

}
