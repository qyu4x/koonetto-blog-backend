package com.koonetto.koneettoblog.request.post;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetPostBySlugRequest {

    @NotNull(message = "slug cannot be empty")
    private String slug;

}
