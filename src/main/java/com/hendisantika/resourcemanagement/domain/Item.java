package com.hendisantika.resourcemanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-24
 * Time: 06:27
 */
@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Column
    private String itemCode;

    @Column
    @NotBlank
    private String name;

    @Column
    private String description;

    @Transient
    @JsonIgnore
    private MultipartFile image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Category_Id_Item")
    @Valid
    private Category categoryItem;

}
