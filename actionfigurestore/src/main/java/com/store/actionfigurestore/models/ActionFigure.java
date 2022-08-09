package com.store.actionfigurestore.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "action_figure")
@Getter
@Setter
@ToString
public class ActionFigure {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @Column(name = "unit_price")
    private Float unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "units_in_stock")
    private Integer unitsInStock;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ActionFigureCategory category;

}
