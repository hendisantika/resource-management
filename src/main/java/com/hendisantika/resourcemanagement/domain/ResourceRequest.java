package com.hendisantika.resourcemanagement.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : resource-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-24
 * Time: 06:35
 */
@Entity
@Data
public class ResourceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    Room room;

    @OneToOne(fetch = FetchType.EAGER)
    Item item;

    @OneToOne(fetch = FetchType.EAGER)
    Member member;

    Date requestdate;

    Date completiondate;
}
