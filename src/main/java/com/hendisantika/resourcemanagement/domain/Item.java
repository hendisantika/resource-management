package com.hendisantika.resourcemanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

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

    @Enumerated(EnumType.STRING)
    private ResourceStatus status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Room_Id_Item")
    private Room roomItem;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Member_Id_Item")
    private Member memberItem;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "itemTranscation")
    private List<Transaction> lstTranscationItem;

}
