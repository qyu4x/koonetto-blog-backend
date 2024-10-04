package com.koonetto.koneettoblog.request.post;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePostRequestBySlugRequest {

    @Size(min = 2, message = "title cannot be less than 2 characters")
    @NotNull(message = "title cannot be empty")
    private String title;

    @Size(min = 255, message = "body cannot be less than 255 characters")
    @NotNull(message = "title cannot be empty")
    private String body;

    @NotNull(message = "slug cannot be empty")
    private String slug;

    @Valid
    @NotNull(message = "category cannot be empty")
    private Category category;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static class Category {

        @NotNull(message = "slug category cannot be empty")
        private Integer slug;

    }

}
