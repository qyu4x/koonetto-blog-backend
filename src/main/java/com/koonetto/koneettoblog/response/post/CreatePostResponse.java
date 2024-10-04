package com.koonetto.koneettoblog.response.post;

import com.koonetto.koneettoblog.request.post.CreatePostRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostResponse {

    private String title;

    private String body;

    private String slug;

    private Long commentCount;

    private Category category;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static class Category {

        private Integer id;

    }

}
