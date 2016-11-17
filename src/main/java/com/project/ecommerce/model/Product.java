package com.project.ecommerce.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by nicolas on 17/11/2016.
 */
public class Product {
    @Id
    @GeneratedValue
    int id;

    String name;
    String description;
    Float price;
    int stock;


}
