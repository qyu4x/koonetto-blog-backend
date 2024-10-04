package com.koonetto.koneettoblog.response.category;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryResponse {

    private Integer id;

    private String name;

    private String slug;

}
