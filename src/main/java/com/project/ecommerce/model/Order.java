package com.project.ecommerce.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by nicolas on 17/11/2016.
 */
@Entity
public class Order {
    @NotNull
    int id;

    List<OrderLine> list;


}
