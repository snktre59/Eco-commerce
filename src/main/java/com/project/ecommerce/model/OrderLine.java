package com.project.ecommerce.model;

import com.google.inject.name.Named;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by nicolas on 17/11/2016.
 */
public class OrderLine {

    @NotNull
    int idOrder;

    @NotNull
    int idProduct;

    int quantity;

}
