package com.koonetto.koneettoblog.request.post;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteOrUpdatePublishedPostByIdRequest {

    @Positive
    @NotNull(message = "id cannot be empty")
    private Integer id;

}
