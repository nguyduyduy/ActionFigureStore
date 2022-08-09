package com.store.actionfigurestore.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.swing.*;
import java.util.Set;

@Entity
@Table(name = "category")
@Getter
@Setter
@ToString
public class ActionFigureCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<ActionFigure> actionFigure;
}
