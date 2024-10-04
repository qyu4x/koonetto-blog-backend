package com.koonetto.koneettoblog.request.category;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryRequest {

    private String name;

}
