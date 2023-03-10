package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "orderEntity")
@Table(name = "order")
public class Order extends BaseEntity {
    @Column(name = "c_customername")
    private String customerName;
    @Column(name = "c_customeraddress")
    private String customerAddress;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

  /*  @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Item> items;*/
}
