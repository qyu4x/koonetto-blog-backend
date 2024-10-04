package com.koonetto.koneettoblog.response.post;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeletePostByIdResponse {

    private Integer id;

    private String slug;

}
