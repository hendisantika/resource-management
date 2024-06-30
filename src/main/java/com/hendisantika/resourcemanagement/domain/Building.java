package com.hendisantika.resourcemanagement.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

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
