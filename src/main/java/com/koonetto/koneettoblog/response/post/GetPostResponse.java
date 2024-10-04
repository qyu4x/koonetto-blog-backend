package com.koonetto.koneettoblog.response.post;

import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetPostResponse {

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

        private String slug;

        private String name;


    }

}
