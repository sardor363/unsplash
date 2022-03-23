package com.sardor.unsplash.entity;

import com.sardor.unsplash.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category extends AbsEntity {
    @Column(nullable = false)
    private String name;
}