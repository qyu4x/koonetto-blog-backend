package com.koonetto.koneettoblog.response.category;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetCategoryResponse {

    private Integer id;

    private String name;

    private String slug;

}
