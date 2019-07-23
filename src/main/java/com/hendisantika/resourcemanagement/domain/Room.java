package com.hendisantika.resourcemanagement.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-24
 * Time: 06:29
 */
@Entity
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty
    @Column
    private String name;
    @Column
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "roomItem", cascade = CascadeType.ALL)
    private List<Item> lstItemsInRoom;

}
