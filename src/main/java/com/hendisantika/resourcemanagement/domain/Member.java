package com.hendisantika.resourcemanagement.domain;

import lombok.Data;
import org.springframework.context.annotation.Role;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-24
 * Time: 06:32
 */
@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "Name")
    @NotEmpty(message = "{fullname.sk}")
    private String name;
    @NotEmpty(message = "Enter {0}")
    @Size(min = 5, max = 8)
    @Column(name = "Username")
    private String username;
    @NotEmpty(message = "Enter {0}")
    // @Size(min=5, max=8)
    @Column(name = "Password")
    private String password;
    @Transient
    private String retype;
    @Column
    @NotEmpty(message = "Select {0}")
    private String gender;
    @Email
    @NotEmpty
    @Column(name = "Email")
    private String email;
    @Column
    private String imageUrl;
    @Transient
    private MultipartFile image;
    @NotNull(message = "Valid date dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column
    @NotEmpty(message = "Enter {0}")
    private String address;
    // @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    // private List<Role>lstRoleMember;
    @OneToOne(fetch = FetchType.EAGER)
    private Role role;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "memberItem", cascade = CascadeType.ALL)
    private List<Item> lstMemberItems;
    @ManyToOne
    @JoinColumn(name = "Room_Id_Member")
    private Room roomMember;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "memberTranscation", cascade = CascadeType.ALL)
    private List<Transaction> lstTranscationMember;
    @Transient
    private String enablePasswordChange;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
