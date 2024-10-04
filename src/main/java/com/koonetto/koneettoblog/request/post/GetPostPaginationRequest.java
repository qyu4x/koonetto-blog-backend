package com.koonetto.koneettoblog.request.post;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetPostPaginationRequest {

    private Integer page;

    private Integer limit;

    private Category category;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    static class Category {

        private String slug;

    }

}
