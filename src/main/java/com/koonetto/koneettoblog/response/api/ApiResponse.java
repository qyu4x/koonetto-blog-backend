package com.koonetto.koneettoblog.response.api;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse <T> {

    private String message;

    private T data;

}
