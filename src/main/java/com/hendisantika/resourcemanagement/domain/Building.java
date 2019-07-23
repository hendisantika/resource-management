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
 * Time: 06:30
 */
@Entity
@Data
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "building", cascade = CascadeType.ALL)
    List<Room> lstRoomInBuilding;

    @Column
    @NotEmpty(message = "building name cannot be empty")
    private String name;

    @Column
    @NotEmpty(message = "building desc cannot be empty")
    private String description;

}
