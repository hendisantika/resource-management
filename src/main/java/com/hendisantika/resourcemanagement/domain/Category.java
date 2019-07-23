package com.hendisantika.resourcemanagement.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-24
 * Time: 06:26
 */
@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer attr;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryItem", cascade = CascadeType.ALL)
    private List<Item> lstCategoryItems;
}
