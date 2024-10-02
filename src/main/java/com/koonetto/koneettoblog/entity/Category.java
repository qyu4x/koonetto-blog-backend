package com.koonetto.koneettoblog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
public class Category implements Serializable {

    @Id
    private Integer id;

    private String name;

    @Column(name = "created_at")
    private Long createdAt;

    @OneToMany(mappedBy = "category")
    private List<Post> posts;

}
